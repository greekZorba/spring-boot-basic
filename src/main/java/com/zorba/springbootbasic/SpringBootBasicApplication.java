package com.zorba.springbootbasic;

//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.web.ServerProperties;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;

/**
 * ComponentScan 애노테이션으로 빈 읽어들이고 등록한 다음,
 * EnableAutoConfiguration 애노테이션으로 추가적으로 읽어들인 빈을 다시 등록한다.
 *
 * EnableAutoConfiguration
 * spring.factories에 있는 키값을 통해 빈들을 등록한다.
 * 빈들도 조건에 따라 생성될지 말지 결정됨
 * */
@SpringBootApplication
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
    }

//    public static void main(String[] args) throws LifecycleException {
//        Tomcat tomcat = new Tomcat();
//
//        Context context = tomcat.addContext("", "/");
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println("<html><head><title>");
//                writer.println("Hey, Tomcat!");
//                writer.println("</title></head>");
//                writer.println("<body><h1>Hello Tomcat!</h1></body>");
//                writer.println("</html>");
//            }
//        };
//
//        String servletName = "helloServlet";
//        tomcat.addServlet("", servletName, servlet);
//        context.addServletMappingDecoded("/hi", servletName);
//
//        tomcat.start();
//        tomcat.getServer().await();
//
//    }

}
