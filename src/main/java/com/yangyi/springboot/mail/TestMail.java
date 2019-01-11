package com.yangyi.springboot.mail;

import com.yangyi.springboot.mail.core.MailSender;
import com.yangyi.springboot.mail.enums.MailContentTypeEnum;

import java.util.ArrayList;

public class TestMail {
    public static void main(String[] args) throws Exception {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>() {{
                    add("285572119@qq.com");
                }})
                .send();
    }
}
