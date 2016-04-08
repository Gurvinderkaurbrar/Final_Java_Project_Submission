<%-- 
    Document   : index1
    Created on : 07-Apr-2016, 01:51:21
    Author     : Ruturaj
--%>

<%@page import="com.demo.Lookup"%>
<%@page import="com.demo.LookupController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->
<html>
    <head>
        <title>CPD4414-Midterm-2016W</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="http://code.jquery.com/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                getAll();
            });

            function getAll() {
                $.ajax({
                    url: "lookup",
                    method: "GET",
                    dataType: "json",
                    success: function (data) {
                        var html = '<tr><th>ID</th><th>Biz Name</th><th>Address</th><th>First_name</th><th>Last_name</th><th>Email</th><th>Contact</th><th>Image</th></tr>';
                        for (var i = 0; i < 100; i++) {
                           
                            html += '<tr><td>' + data[i].info_id+ '</td>';
                            html += '<td>' + data[i].biz_name + '</td>';
                            html += '<td>' + data[i].address + '</td>';
                            html += '<td>' + data[i].firt_name + '</td>';
                            html += '<td>' + data[i].last_name + '</td>';
                            html += '<td>' + data[i].email + '</td>';
                            html += '<td>' + data[i].contact_no + '</td>';
                            html += '<td>' + data[i].image + '</td></tr>';
                        }
                        $('#output').html(html);
                    }
                })
            }
 
        </script>
    </head>
    <body>
        <% LookupController l = new LookupController();
                
           Lookup lp = new Lookup();
           out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjj"+lp.getContactNo());
           %>
        <div class="container">            
            <div><button class="btn btn-primary" onclick="getAll()">Refresh</button></div>
             <table class="table" id="output"></table>
        </div>
    </body>
</html>



        <% 
           
            out.println(l.getAll());
            
            %>