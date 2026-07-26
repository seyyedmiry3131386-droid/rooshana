package ir.mservices.market.app.survey.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class QuestionDto implements Serializable {

    @vo7("answers")
    private final List<AnswerDto> answers;

    @vo7("id")
    private final int id;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    public QuestionDto(int i, String str, List<AnswerDto> list) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(list, "answers");
        this.id = i;
        this.text = str;
        this.answers = list;
    }

    public final List<AnswerDto> getAnswers() {
        return this.answers;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }
}
