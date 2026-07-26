package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import ir.mservices.market.app.survey.data.CancelQuestionRequestDto;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class uc8 extends o2 {
    public final Object g(String str, CancelQuestionRequestDto cancelQuestionRequestDto, Object obj, ContinuationImpl continuationImpl) {
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/questions/cancel", b.O(new Pair("packageName", str)), getCommonQueryParam());
        Type type = new TypeToken<ApplicationSurveyDto>() { // from class: ir.mservices.market.app.survey.service.SurveyService$cancelQuestion$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Map<String, String> headers = getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        return dy3.G(this, type, z57VarCreateRequestUrl, cancelQuestionRequestDto, obj, headers, null, continuationImpl, 480);
    }

    public final Object h(String str, Object obj, SuspendLambda suspendLambda) {
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/questions", b.O(new Pair("packageName", str)), getCommonQueryParam());
        Type type = new TypeToken<ApplicationSurveyDto>() { // from class: ir.mservices.market.app.survey.service.SurveyService$getAppSurveyQuestions$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(this, type, z57VarCreateRequestUrl, obj, suspendLambda, 504);
    }
}
