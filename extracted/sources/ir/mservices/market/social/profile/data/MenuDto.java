package ir.mservices.market.social.profile.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MenuDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("actionText")
    private final String actionText;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("type")
    private final String type;

    public MenuDto(String str, String str2, String str3, String str4) {
        this.text = str;
        this.actionText = str2;
        this.action = str3;
        this.type = str4;
    }

    public static /* synthetic */ MenuDto copy$default(MenuDto menuDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menuDto.text;
        }
        if ((i & 2) != 0) {
            str2 = menuDto.actionText;
        }
        if ((i & 4) != 0) {
            str3 = menuDto.action;
        }
        if ((i & 8) != 0) {
            str4 = menuDto.type;
        }
        return menuDto.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.actionText;
    }

    public final String component3() {
        return this.action;
    }

    public final String component4() {
        return this.type;
    }

    public final MenuDto copy(String str, String str2, String str3, String str4) {
        return new MenuDto(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuDto)) {
            return false;
        }
        MenuDto menuDto = (MenuDto) obj;
        return js3.i(this.text, menuDto.text) && js3.i(this.actionText, menuDto.actionText) && js3.i(this.action, menuDto.action) && js3.i(this.type, menuDto.type);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return dw1.p(this.action, ", type=", this.type, ")", rm7.t("MenuDto(text=", this.text, ", actionText=", this.actionText, ", action="));
    }
}
