package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMessagingDto implements Serializable {

    @vo7("intent")
    private final String intent;

    @vo7("isEnabled")
    private final Boolean isEnabled;

    @vo7("title")
    private final String title;

    @vo7("unread")
    private final Boolean unread;

    public ProfileMessagingDto(String str, String str2, Boolean bool, Boolean bool2) {
        this.title = str;
        this.intent = str2;
        this.isEnabled = bool;
        this.unread = bool2;
    }

    public static /* synthetic */ ProfileMessagingDto copy$default(ProfileMessagingDto profileMessagingDto, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileMessagingDto.title;
        }
        if ((i & 2) != 0) {
            str2 = profileMessagingDto.intent;
        }
        if ((i & 4) != 0) {
            bool = profileMessagingDto.isEnabled;
        }
        if ((i & 8) != 0) {
            bool2 = profileMessagingDto.unread;
        }
        return profileMessagingDto.copy(str, str2, bool, bool2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.intent;
    }

    public final Boolean component3() {
        return this.isEnabled;
    }

    public final Boolean component4() {
        return this.unread;
    }

    public final ProfileMessagingDto copy(String str, String str2, Boolean bool, Boolean bool2) {
        return new ProfileMessagingDto(str, str2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileMessagingDto)) {
            return false;
        }
        ProfileMessagingDto profileMessagingDto = (ProfileMessagingDto) obj;
        return js3.i(this.title, profileMessagingDto.title) && js3.i(this.intent, profileMessagingDto.intent) && js3.i(this.isEnabled, profileMessagingDto.isEnabled) && js3.i(this.unread, profileMessagingDto.unread);
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean getUnread() {
        return this.unread;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.intent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.unread;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.intent;
        Boolean bool = this.isEnabled;
        Boolean bool2 = this.unread;
        StringBuilder sbT = rm7.t("ProfileMessagingDto(title=", str, ", intent=", str2, ", isEnabled=");
        sbT.append(bool);
        sbT.append(", unread=");
        sbT.append(bool2);
        sbT.append(")");
        return sbT.toString();
    }
}
