package ir.mservices.market.social.profile.list.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialMessagingDto implements Serializable {

    @vo7("avatars")
    private final List<String> avatars;

    @vo7("intent")
    private final String intent;

    @vo7("title")
    private final String title;

    public SocialMessagingDto(String str, String str2, List<String> list) {
        js3.p(str, "title");
        this.title = str;
        this.intent = str2;
        this.avatars = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialMessagingDto copy$default(SocialMessagingDto socialMessagingDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialMessagingDto.title;
        }
        if ((i & 2) != 0) {
            str2 = socialMessagingDto.intent;
        }
        if ((i & 4) != 0) {
            list = socialMessagingDto.avatars;
        }
        return socialMessagingDto.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.intent;
    }

    public final List<String> component3() {
        return this.avatars;
    }

    public final SocialMessagingDto copy(String str, String str2, List<String> list) {
        js3.p(str, "title");
        return new SocialMessagingDto(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialMessagingDto)) {
            return false;
        }
        SocialMessagingDto socialMessagingDto = (SocialMessagingDto) obj;
        return js3.i(this.title, socialMessagingDto.title) && js3.i(this.intent, socialMessagingDto.intent) && js3.i(this.avatars, socialMessagingDto.avatars);
    }

    public final List<String> getAvatars() {
        return this.avatars;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.intent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.avatars;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.intent;
        List<String> list = this.avatars;
        StringBuilder sbT = rm7.t("SocialMessagingDto(title=", str, ", intent=", str2, ", avatars=");
        sbT.append(list);
        sbT.append(")");
        return sbT.toString();
    }
}
