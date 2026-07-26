package androidx.compose.ui.text;

import defpackage.ad7;
import defpackage.br9;
import defpackage.c28;
import defpackage.i49;
import defpackage.js3;
import defpackage.kl;
import defpackage.n09;
import defpackage.p16;
import defpackage.p74;
import defpackage.q74;
import defpackage.qp2;
import defpackage.u78;
import defpackage.xd7;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AnnotationType annotationType;
        Object objA;
        ad7 ad7Var = (ad7) obj;
        kl klVar = (kl) obj2;
        Object obj3 = klVar.a;
        if (obj3 instanceof p16) {
            annotationType = AnnotationType.a;
        } else if (obj3 instanceof c28) {
            annotationType = AnnotationType.b;
        } else if (obj3 instanceof i49) {
            annotationType = AnnotationType.c;
        } else if (obj3 instanceof n09) {
            annotationType = AnnotationType.d;
        } else if (obj3 instanceof q74) {
            annotationType = AnnotationType.e;
        } else if (obj3 instanceof p74) {
            annotationType = AnnotationType.f;
        } else {
            if (!(obj3 instanceof u78)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.g;
        }
        switch (annotationType.ordinal()) {
            case 0:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objA = xd7.a((p16) obj3, xd7.g, ad7Var);
                break;
            case 1:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objA = xd7.a((c28) obj3, xd7.h, ad7Var);
                break;
            case 2:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objA = xd7.a((i49) obj3, xd7.c, ad7Var);
                break;
            case 3:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objA = xd7.a((n09) obj3, xd7.d, ad7Var);
                break;
            case 4:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objA = xd7.a((q74) obj3, xd7.e, ad7Var);
                break;
            case 5:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objA = xd7.a((p74) obj3, xd7.f, ad7Var);
                break;
            case 6:
                js3.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objA = ((u78) obj3).a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return br9.o(annotationType, objA, Integer.valueOf(klVar.b), Integer.valueOf(klVar.c), klVar.d);
    }
}
