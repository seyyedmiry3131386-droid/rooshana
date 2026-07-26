package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileRequestDto implements Serializable {

    @vo7("avatars")
    private final ArrayList<String> avatars;

    @vo7("count")
    private final String count;

    @vo7("message")
    private final String message;

    public ProfileRequestDto(String str, String str2, ArrayList<String> arrayList) {
        js3.p(str, "count");
        js3.p(str2, "message");
        js3.p(arrayList, "avatars");
        this.count = str;
        this.message = str2;
        this.avatars = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileRequestDto copy$default(ProfileRequestDto profileRequestDto, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileRequestDto.count;
        }
        if ((i & 2) != 0) {
            str2 = profileRequestDto.message;
        }
        if ((i & 4) != 0) {
            arrayList = profileRequestDto.avatars;
        }
        return profileRequestDto.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.count;
    }

    public final String component2() {
        return this.message;
    }

    public final ArrayList<String> component3() {
        return this.avatars;
    }

    public final ProfileRequestDto copy(String str, String str2, ArrayList<String> arrayList) {
        js3.p(str, "count");
        js3.p(str2, "message");
        js3.p(arrayList, "avatars");
        return new ProfileRequestDto(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRequestDto)) {
            return false;
        }
        ProfileRequestDto profileRequestDto = (ProfileRequestDto) obj;
        return js3.i(this.count, profileRequestDto.count) && js3.i(this.message, profileRequestDto.message) && js3.i(this.avatars, profileRequestDto.avatars);
    }

    public final ArrayList<String> getAvatars() {
        return this.avatars;
    }

    public final String getCount() {
        return this.count;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.avatars.hashCode() + rm7.k(this.message, this.count.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.count;
        String str2 = this.message;
        ArrayList<String> arrayList = this.avatars;
        StringBuilder sbT = rm7.t("ProfileRequestDto(count=", str, ", message=", str2, ", avatars=");
        sbT.append(arrayList);
        sbT.append(")");
        return sbT.toString();
    }
}
