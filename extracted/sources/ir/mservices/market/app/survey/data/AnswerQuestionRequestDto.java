package ir.mservices.market.app.survey.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class AnswerQuestionRequestDto implements RequestDTO {

    @vo7("answerId")
    private final int answerId;

    public AnswerQuestionRequestDto(int i) {
        this.answerId = i;
    }

    public final int getAnswerId() {
        return this.answerId;
    }
}
