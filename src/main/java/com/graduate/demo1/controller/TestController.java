package com.graduate.demo1.controller;


import com.graduate.demo1.model.City_content;
import com.graduate.demo1.model.City_info;
import com.graduate.demo1.model.Poem_note;
import com.graduate.demo1.model.Road;
import com.graduate.demo1.service.City_contentService;
import com.graduate.demo1.service.City_infoService;
import com.graduate.demo1.service.Poem_noteService;
import com.graduate.demo1.service.RoadService;
import com.graduate.demo1.vo.DataVo;
import com.graduate.demo1.vo.DataVo2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Resource
    private City_infoService city_infoService;
    @Resource
    private City_contentService city_contentService;
    @Resource
    private Poem_noteService poem_noteService;
    @Resource
    private RoadService roadService;

//    @RequestMapping("/index")
//    public String showindex(Model model){
//        model.addAttribute("sss","sss");
//        return "test2";
//    }

    @GetMapping("/showcity")
    @CrossOrigin
    public DataVo showCity(@RequestParam("city") String city,@RequestParam("time")String age) {
        //String city = "眉山";
        System.out.println("城市："+city+"---年龄段："+age);
        String min_age = "1";
        String max_age = "66岁";
        //若不是“苏轼生平”
        if (!age.equals("苏轼生平")){
            min_age = age.split("--")[0];
            max_age = age.split("--")[1];
        }

        //找到该城市对应的每一条info，每一条info对应一个order
        List<City_info> city_infos = city_infoService.findCity_infosByCityAndAge(city,min_age,max_age);
        List<List<City_content>> city_contents = new ArrayList<List<City_content>>();
        List<List<List<Poem_note>>> poem_note_pro = new ArrayList<List<List<Poem_note>>>();
        List<Road> roads = roadService.findRoadsByCity(city);

        int order;

        for (City_info e:city_infos){
            //先将每一个City_info的city属性加上年龄段
            e.setCity(e.getCity()+"（"+min_age+"--"+max_age+"）");
            //
            List<List<Poem_note>> poem_notes = new ArrayList<>();
            //每一条info对应一个order
            order = city_infoService.findOrder(e.getTime(),city);
            System.out.println("order为："+order);
            //通过每一个order找到其所对应的所有content
            List<City_content> part_city_contents = city_contentService.findCity_contentsByOrder(order,city);
            System.out.println("该order对应的content为："+part_city_contents);
            //遍历每一条content找注释，因为一条content里面可能会有多条注释
                for (City_content i:part_city_contents){
                    String poem_name = i.getPoem_name();
                    //ee用来存放该content对应的所有注释
                    List<Poem_note> ee = poem_noteService.findNotesByPoem_name(poem_name);
                    poem_notes.add(ee);
                }
            poem_note_pro.add(poem_notes);
            city_contents.add(part_city_contents);
        }


        DataVo dataVo = new DataVo();
        dataVo.setCity_info(city_infos);
        dataVo.setCity_content(city_contents);
        dataVo.setPoem_note(poem_note_pro);
        dataVo.setList_road(roads);
        return dataVo;
    }

    @GetMapping("/showroute")
    @CrossOrigin
    public List<DataVo2> showRoute(@RequestParam Map<String,String> line) {
        //获取该段路程所属时间段
        String time = line.get("time");
        //获取该段的起始位置和终点位置
        String startCity = line.get("startCity");
        String endCity = line.get("endCity");

        //如果不是“苏轼生平”，则只有一个时间段
        List<String> Time = new ArrayList<String>();
        if (!time.equals("苏轼生平")){
            Time.add(time);
        }else {
            Time.addAll(Arrays.asList("1--21岁","21--22岁","22--24岁","24--27岁","27--28岁","28--29岁","29--32岁","32--33岁","33--36岁","36--37岁","37--38岁","38--39岁","39--43岁","43--44岁","44--45岁","45--46岁","46--47岁","47--48岁","48--49岁","49--50岁","50--54岁","54--56岁","56--57岁","57--58岁","58--59岁","59--62岁","62--65岁","65--66岁"));
        }

        String route_flag = startCity+" → "+endCity;
        ArrayList<DataVo2> dataVo2s = new ArrayList<>();

        for (String ii:Time) {
            Road road = roadService.findRoadByAge(ii);
            //数据封装
            //如果路线里面没有包含目标段，则不用显示，即不用加入List
            if (road.getRoute().indexOf(route_flag)!=-1) {
                DataVo2 dataVo2 = new DataVo2();
                dataVo2.setRoute_date(road.getDate());
                dataVo2.setRoute_time(road.getTime());
                dataVo2.setRoute_flag(route_flag);
                dataVo2.setRoute(road.getRoute());
                dataVo2s.add(dataVo2);
            }
        }
        return dataVo2s;
    }
}
