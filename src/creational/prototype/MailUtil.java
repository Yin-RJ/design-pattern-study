package creational.prototype;

import java.text.MessageFormat;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学, 邮件地址:{1}, 邮件内容:{2}发送成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录, originMai: " + mail.getContent());
    }
}
