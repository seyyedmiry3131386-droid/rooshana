package ir.mservices.market.app.survey.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnswerDto implements Serializable {

    @vo7("id")
    private final int id;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public AnswerDto(int i, String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.id = i;
        this.text = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AnswerDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.survey.data.AnswerDto");
        AnswerDto answerDto = (AnswerDto) obj;
        return this.id == answerDto.id && js3.i(this.text, answerDto.text);
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id * 31);
    }
}
