package ir.mservices.market.app.survey.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.app.survey.data.AnswerDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AnswerData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_answer;
    public final AnswerDto a;
    public final v48 b;

    public AnswerData(AnswerDto answerDto, v48 v48Var) {
        js3.p(answerDto, "answer");
        js3.p(v48Var, "selectedFlow");
        this.a = answerDto;
        this.b = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnswerData.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.a, ((AnswerData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.getId());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
