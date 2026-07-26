package ir.mservices.market.app.survey.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationSurveyDto implements Serializable {

    @vo7("questionsResult")
    private final List<QuestionDto> questions;

    public ApplicationSurveyDto(List<QuestionDto> list) {
        js3.p(list, "questions");
        this.questions = list;
    }

    public final List<QuestionDto> getQuestions() {
        return this.questions;
    }
}
