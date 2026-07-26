package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class AppStatusDto implements RequestDTO {
    private long actionTime;
    private String packageName;
    private String type;

    public interface Type {
        public static final String ADD = "add";
        public static final String REMOVE = "remove";
        public static final String UPDATE = "update";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Types {
    }

    public AppStatusDto(String str, long j, String str2) {
        this.packageName = str;
        this.actionTime = j;
        this.type = str2;
    }
}
