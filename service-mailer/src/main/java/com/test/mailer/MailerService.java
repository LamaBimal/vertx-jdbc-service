package com.test.mailer;

import com.test.mailer.Impl.mailerServiceImpl;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.serviceproxy.ProxyHelper;

/**
 * Created by btamang on 12/2/16.
 */
@ProxyGen
@VertxGen
public interface MailerService {

    static MailerService create(){ return new mailerServiceImpl();}
    static MailerService createProxy(Vertx vertx,String address){
        return ProxyHelper.createProxy(MailerService.class,vertx,address);
    }
    void sendAttachment(String from,String To,String Filename,String Title,Handler<AsyncResult<JsonObject>> resultHandler);
}
