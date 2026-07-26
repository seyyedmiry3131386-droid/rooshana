package ir.mservices.market.social.profile.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bl4;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TagItem implements Serializable {

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final String value;

    public TagItem(String str, String str2) {
        this.text = str;
        this.value = str2;
    }

    public static /* synthetic */ TagItem copy$default(TagItem tagItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagItem.text;
        }
        if ((i & 2) != 0) {
            str2 = tagItem.value;
        }
        return tagItem.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.value;
    }

    public final TagItem copy(String str, String str2) {
        return new TagItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagItem)) {
            return false;
        }
        TagItem tagItem = (TagItem) obj;
        return js3.i(this.text, tagItem.text) && js3.i(this.value, tagItem.value);
    }

    public final String getText() {
        return this.text;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return bl4.w("TagItem(text=", this.text, ", value=", this.value, ")");
    }
}
