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

   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "skills")
   @ResponseBody
   public String skillsWithQueryParam(@RequestParam String name, @RequestParam String language1,
                                      @RequestParam String language2, @RequestParam String language3){
      String str = null;

     str =  "Name: \n"+name+"\n"+"My favorite language:\n"+language1+"\n"+
              "My second favorite language: \n"+language2+"\n"+
              "My third favorite language: \n"+language3+"\n";
      return str;
   }
//   @GetMapping("skills/{name}/{language1}/{language2}/{language3}")
//   @ResponseBody
//   public String skillsWithParam(@PathVariable String name, @PathVariable String language1,
//                                 @PathVariable String language2, @PathVariable String language3){
//      return "Name: \n"+name+"\n"+"My favorite language:\n"+language1+"\n"+
//              "My second favorite language: \n"+language2+"\n"+
//              "My third favorite language: \n"+language3+"\n";
//
//   }

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
              "<option value = 'JavaScript'>Java Script</option>"+
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
