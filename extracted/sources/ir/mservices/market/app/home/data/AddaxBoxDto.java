package ir.mservices.market.app.home.data;

import defpackage.dw1;
import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import defpackage.o40;
import defpackage.r22;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class AddaxBoxDto extends HomeItemDTO implements Serializable {

    @vo7("actionIntent")
    private final String actionIntent;

    @vo7("actionText")
    private final String actionText;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("id")
    private final String id;

    @vo7("message")
    private final String message;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public AddaxBoxDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str, "id");
        js3.p(str2, "type");
        this.id = str;
        this.type = str2;
        this.title = str3;
        this.message = str4;
        this.iconUrl = str5;
        this.actionText = str6;
        this.actionIntent = str7;
        this.displayMode = str8;
    }

    public static /* synthetic */ AddaxBoxDto copy$default(AddaxBoxDto addaxBoxDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addaxBoxDto.id;
        }
        if ((i & 2) != 0) {
            str2 = addaxBoxDto.type;
        }
        if ((i & 4) != 0) {
            str3 = addaxBoxDto.title;
        }
        if ((i & 8) != 0) {
            str4 = addaxBoxDto.message;
        }
        if ((i & 16) != 0) {
            str5 = addaxBoxDto.iconUrl;
        }
        if ((i & 32) != 0) {
            str6 = addaxBoxDto.actionText;
        }
        if ((i & 64) != 0) {
            str7 = addaxBoxDto.actionIntent;
        }
        if ((i & 128) != 0) {
            str8 = addaxBoxDto.displayMode;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return addaxBoxDto.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final boolean canAddAddax() {
        String str;
        String str2 = this.title;
        if ((str2 == null || f88.n0(str2)) && ((str = this.message) == null || f88.n0(str))) {
            return false;
        }
        r22 entries = AddaxType.getEntries();
        if (entries != null && entries.isEmpty()) {
            return false;
        }
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            if (m88.T(((AddaxType) it.next()).getType(), this.type, true)) {
                return true;
            }
        }
        return false;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.actionText;
    }

    public final String component7() {
        return this.actionIntent;
    }

    public final String component8() {
        return this.displayMode;
    }

    public final AddaxBoxDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str, "id");
        js3.p(str2, "type");
        return new AddaxBoxDto(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddaxBoxDto)) {
            return false;
        }
        AddaxBoxDto addaxBoxDto = (AddaxBoxDto) obj;
        return js3.i(this.id, addaxBoxDto.id) && js3.i(this.type, addaxBoxDto.type) && js3.i(this.title, addaxBoxDto.title) && js3.i(this.message, addaxBoxDto.message) && js3.i(this.iconUrl, addaxBoxDto.iconUrl) && js3.i(this.actionText, addaxBoxDto.actionText) && js3.i(this.actionIntent, addaxBoxDto.actionIntent) && js3.i(this.displayMode, addaxBoxDto.displayMode);
    }

    public final String getActionIntent() {
        return this.actionIntent;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iK = rm7.k(this.type, this.id.hashCode() * 31, 31);
        String str = this.title;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionIntent;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayMode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.message;
        String str5 = this.iconUrl;
        String str6 = this.actionText;
        String str7 = this.actionIntent;
        String str8 = this.displayMode;
        StringBuilder sbT = rm7.t("AddaxBoxDto(id=", str, ", type=", str2, ", title=");
        o40.I(str3, ", message=", str4, ", iconUrl=", sbT);
        o40.I(str5, ", actionText=", str6, ", actionIntent=", sbT);
        return dw1.p(str7, ", displayMode=", str8, ")", sbT);
    }
}
