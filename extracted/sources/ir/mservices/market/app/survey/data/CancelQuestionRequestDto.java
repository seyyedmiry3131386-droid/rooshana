package ir.mservices.market.app.survey.data;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class CancelQuestionRequestDto implements RequestDTO {

    @vo7("questionId")
    private final Integer questionId;

    public CancelQuestionRequestDto(Integer num) {
        this.questionId = num;
    }

    public final Integer getQuestionId() {
        return this.questionId;
    }
}
