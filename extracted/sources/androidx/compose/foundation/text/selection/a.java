package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import defpackage.bt2;
import defpackage.d1;
import defpackage.js3;
import defpackage.ng8;
import defpackage.q96;
import defpackage.s08;
import defpackage.tx8;
import defpackage.vc4;
import defpackage.w61;
import defpackage.wb5;
import defpackage.wc4;
import defpackage.wf8;
import defpackage.wu0;
import defpackage.x96;
import defpackage.xf8;
import defpackage.zi8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class a implements x96 {
    public final w61 a;
    public final Context b;
    public final SelectedTextType c;
    public final wc4 d;
    public TextClassifier f;
    public final kotlinx.coroutines.sync.a e = new kotlinx.coroutines.sync.a();
    public final wb5 g = androidx.compose.runtime.g.h(null);
    public final Object h = new Object();

    public a(w61 w61Var, Context context, SelectedTextType selectedTextType, wc4 wc4Var) {
        this.a = w61Var;
        this.b = context;
        this.c = selectedTextType;
        this.d = wc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.text.selection.a r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.a.a(androidx.compose.foundation.text.selection.a, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(xf8 xf8Var, String str, long j, h hVar) {
        kotlinx.coroutines.sync.a aVar = this.e;
        TextClassification textClassification = null;
        if (aVar.g()) {
            wf8 wf8Var = (wf8) ((s08) this.g).getValue();
            TextClassification textClassification2 = (wf8Var != null && zi8.c(j, wf8Var.b) && js3.i(str, wf8Var.a)) ? wf8Var.c : null;
            aVar.d(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            hVar.invoke(xf8Var);
            return;
        }
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            xf8Var.a.g(new ng8(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            xf8Var.a.g(new ng8(obj, textClassification, -1));
        }
        hVar.invoke(xf8Var);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                xf8Var.a.g(new ng8(obj, textClassification, i));
            }
        }
    }

    public final LocaleList c() {
        wc4 wc4Var = this.d;
        if (wc4Var == null) {
            d1.f();
            return d1.d(new Locale[]{q96.a.b().a().a});
        }
        ArrayList arrayList = new ArrayList(wu0.V(wc4Var, 10));
        Iterator it = wc4Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((vc4) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return d1.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object d(CharSequence charSequence, long j, SuspendLambda suspendLambda) {
        if (charSequence.length() == 0 || zi8.d(j)) {
            return tx8.a;
        }
        return bt2.Z(this.a, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(j, null, this, charSequence), null), suspendLambda);
    }
}
