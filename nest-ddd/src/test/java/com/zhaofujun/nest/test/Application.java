package com.zhaofujun.nest.test;

import com.zhaofujun.nest.NestApplication;
import com.zhaofujun.nest.context.appservice.ApplicationServiceCreator;
import com.zhaofujun.nest.test.application.TeacherApplicationService;


public class Application {
    public static void main(String[] args)   {


        NestApplication application = NestApplication.current();
        application.start();

        TeacherApplicationService teacherApplicationService=ApplicationServiceCreator.create(TeacherApplicationService.class);
        teacherApplicationService.teachCreate();

        application.close();

////        application.getRepositoryManager().addRepository(new UserRepository());
//        UserApplicationService userService = ApplicationServiceCreator.create(UserApplicationService.class);
//        userService.create();
//
////        long s = System.currentTimeMillis();
////        for (int i = 0; i < 1000; i++) {
//////            userService.create();
////        userService.change(1);
//////            userService.change(2);
//////            userService.change(2);
////            userService.change(i);
////        }
////        Long e = System.currentTimeMillis();
////        System.out.println("耗时：" + (e - s));
//        application.close();
////        System.out.println("end");
////        String js="{\"CGLIB$BOUND\":true,\"CGLIB$CALLBACK_0\":null,\"name\":\"name1\",\"age\":11,\"id\":{\"id\":10},\"_version\":0,\"__type__\":\"com.zhaofujun.nest.test.domain.User\"}";
////        JsonCreator jsonCreator=new JsonCreator();
////        User user = jsonCreator.toObj(js, User.class);
    }
}
