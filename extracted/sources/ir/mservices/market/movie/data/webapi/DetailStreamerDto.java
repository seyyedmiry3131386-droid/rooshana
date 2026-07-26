package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailStreamerDto implements Serializable {

    @vo7("avatarUrl")
    private final String avatarUrl;

    @vo7("streamerKey")
    private final String streamerKey;

    @vo7("title")
    private final String title;

    public DetailStreamerDto(String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str2, "avatarUrl");
        js3.p(str3, "streamerKey");
        this.title = str;
        this.avatarUrl = str2;
        this.streamerKey = str3;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getStreamerKey() {
        return this.streamerKey;
    }

    public final String getTitle() {
        return this.title;
    }
}
