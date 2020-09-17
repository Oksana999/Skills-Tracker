package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Oksana
 */
@Controller
public class SkillsController {

   @GetMapping()
   @ResponseBody
   public String skillList(){
      return "<h1>Skills Tracker</h1>"+
              "<h2>These are some skills</h2>"+
              "<ol>"+
              "<li><b>Java</b></li>"+
              "<li><b>C++</b></li>"+
              "<li><b>Kotlin</b></li>"+
              "</ol>";
   }

   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "skills")
   @ResponseBody
   public String skillsWithQueryParam(@RequestParam String name, @RequestParam String language1,
                                      @RequestParam String language2, @RequestParam String language3){
      String str = null;

     str =  "<h1>"+ name + "</h1><br>" +
            "<li>" + language1 + "</li>" +
            "<li>" + language2 + "</li>" +
            "<li>" + language3 + "</li>" +
            "</ol>";
      return str;
   }


   @GetMapping("form")
   @ResponseBody
   public String helloForm(){
      return "<html>"+
              "<body>"+
              "<form action = 'skills' method = 'post'>" +
              "<label>Name:</label><br>"+
              "<input type = 'text' name = 'name'><br>"+
              "<label>My favorite language:</label><br>"+
              "<select name = 'language1'><br>"+
              "<option value = 'Java' selected>Java</option>"+
              "<option value = 'Kotlin'>Kotlin Script</option>"+
              "<option value = 'C++'>C++</option>"+
              "</select><br>"+
              "<label>My second favorite language:</label><br>"+
              "<select name = 'language2'><br>"+
              "<option value = 'Java' selected>Java</option>"+
              "<option value = 'JavaScript'>Java Script</option>"+
              "<option value = 'C++'>C++</option>"+
              "</select><br>"+
              "<label>My third favorite language:</label><br>"+
              "<select name = 'language3'><br>"+
              "<option value = 'Java' selected>Java</option>"+
              "<option value = 'JavaScript'>Java Script</option>"+
              "<option value = 'C++'>C++</option>"+
              "</select><br>"+
              "<input type = 'submit' value = 'Submit'>"+
              "</form>"+
              "</body>"+
              "</html>";
   }
}
