package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AvatarDto extends ResultDTO implements Serializable {
    private String avatarUrl;

    public AvatarDto(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
}
