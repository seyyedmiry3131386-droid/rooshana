package ir.mservices.market.app.detail.data;

import defpackage.bl4;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AIReviewDto implements Serializable {

    @vo7("id")
    private final String id;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public AIReviewDto(String str, String str2) {
        js3.p(str, "id");
        js3.p(str2, ConfirmDTO.INPUT_TYPE_TEXT);
        this.id = str;
        this.text = str2;
    }

    public static /* synthetic */ AIReviewDto copy$default(AIReviewDto aIReviewDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIReviewDto.id;
        }
        if ((i & 2) != 0) {
            str2 = aIReviewDto.text;
        }
        return aIReviewDto.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final AIReviewDto copy(String str, String str2) {
        js3.p(str, "id");
        js3.p(str2, ConfirmDTO.INPUT_TYPE_TEXT);
        return new AIReviewDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIReviewDto)) {
            return false;
        }
        AIReviewDto aIReviewDto = (AIReviewDto) obj;
        return js3.i(this.id, aIReviewDto.id) && js3.i(this.text, aIReviewDto.text);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return bl4.w("AIReviewDto(id=", this.id, ", text=", this.text, ")");
    }
}
