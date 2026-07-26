package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.ah0;
import defpackage.ba6;
import defpackage.bj3;
import defpackage.bp2;
import defpackage.cj3;
import defpackage.ck4;
import defpackage.dp2;
import defpackage.js3;
import defpackage.od1;
import defpackage.ok4;
import defpackage.pk4;
import defpackage.py6;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.sy6;
import defpackage.tx8;
import defpackage.vt;
import defpackage.x51;
import defpackage.xq2;
import defpackage.zb5;
import defpackage.zh8;
import defpackage.zi8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ba6 {
    public final View a;
    public final b b;
    public final od1 c;
    public boolean d;
    public dp2 e;
    public dp2 f;
    public zh8 g;
    public cj3 h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final a l;
    public final zb5 m;
    public c n;

    public d(View view, AndroidComposeView androidComposeView) {
        b bVar = new b(view);
        od1 od1Var = new od1(4, Choreographer.getInstance());
        this.a = view;
        this.b = bVar;
        this.c = od1Var;
        this.e = new dp2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        };
        this.f = new dp2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // defpackage.dp2
            public final /* synthetic */ Object invoke(Object obj) {
                int i = ((bj3) obj).a;
                return tx8.a;
            }
        };
        this.g = new zh8("", zi8.b, 4);
        this.h = cj3.f;
        this.i = new ArrayList();
        this.j = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return new BaseInputConnection(this.g.a, false);
            }
        });
        this.l = new a(androidComposeView, bVar);
        this.m = new zb5(0, new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // defpackage.ba6
    public final void a() {
        i(TextInputServiceAndroid$TextInputCommand.a);
    }

    @Override // defpackage.ba6
    public final void b() {
        i(TextInputServiceAndroid$TextInputCommand.c);
    }

    @Override // defpackage.ba6
    public final void c() {
        this.d = false;
        this.e = new dp2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        };
        this.f = new dp2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // defpackage.dp2
            public final /* synthetic */ Object invoke(Object obj) {
                int i = ((bj3) obj).a;
                return tx8.a;
            }
        };
        this.k = null;
        i(TextInputServiceAndroid$TextInputCommand.b);
    }

    @Override // defpackage.ba6
    public final void d(zh8 zh8Var, cj3 cj3Var, vt vtVar, x51 x51Var) {
        this.d = true;
        this.g = zh8Var;
        this.h = cj3Var;
        this.e = vtVar;
        this.f = x51Var;
        i(TextInputServiceAndroid$TextInputCommand.a);
    }

    @Override // defpackage.ba6
    public final void e(zh8 zh8Var, rr5 rr5Var, ri8 ri8Var, ah0 ah0Var, sy6 sy6Var, sy6 sy6Var2) {
        a aVar = this.l;
        synchronized (aVar.c) {
            try {
                aVar.j = zh8Var;
                aVar.l = rr5Var;
                aVar.k = ri8Var;
                aVar.m = ah0Var;
                aVar.n = sy6Var;
                aVar.o = sy6Var2;
                if (aVar.e || aVar.d) {
                    aVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v13, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c24, java.lang.Object] */
    @Override // defpackage.ba6
    public final void f(zh8 zh8Var, zh8 zh8Var2) {
        boolean z = (zi8.c(this.g.b, zh8Var2.b) && js3.i(this.g.c, zh8Var2.c)) ? false : true;
        this.g = zh8Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            py6 py6Var = (py6) ((WeakReference) this.i.get(i)).get();
            if (py6Var != null) {
                py6Var.d = zh8Var2;
            }
        }
        a aVar = this.l;
        synchronized (aVar.c) {
            aVar.j = null;
            aVar.l = null;
            aVar.k = null;
            aVar.m = new dp2() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // defpackage.dp2
                public final /* synthetic */ Object invoke(Object obj) {
                    float[] fArr = ((pk4) obj).a;
                    return tx8.a;
                }
            };
            aVar.n = null;
            aVar.o = null;
        }
        if (js3.i(zh8Var, zh8Var2)) {
            if (z) {
                b bVar = this.b;
                int iG = zi8.g(zh8Var2.b);
                int iF = zi8.f(zh8Var2.b);
                zi8 zi8Var = this.g.c;
                int iG2 = zi8Var != null ? zi8.g(zi8Var.a) : -1;
                zi8 zi8Var2 = this.g.c;
                ((InputMethodManager) bVar.b.getValue()).updateSelection(bVar.a, iG, iF, iG2, zi8Var2 != null ? zi8.f(zi8Var2.a) : -1);
                return;
            }
            return;
        }
        if (zh8Var != null && (!js3.i(zh8Var.a.b, zh8Var2.a.b) || (zi8.c(zh8Var.b, zh8Var2.b) && !js3.i(zh8Var.c, zh8Var2.c)))) {
            b bVar2 = this.b;
            ((InputMethodManager) bVar2.b.getValue()).restartInput(bVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            py6 py6Var2 = (py6) ((WeakReference) this.i.get(i2)).get();
            if (py6Var2 != null) {
                zh8 zh8Var3 = this.g;
                b bVar3 = this.b;
                if (py6Var2.h) {
                    py6Var2.d = zh8Var3;
                    if (py6Var2.f) {
                        ((InputMethodManager) bVar3.b.getValue()).updateExtractedText(bVar3.a, py6Var2.e, xq2.J(zh8Var3));
                    }
                    zi8 zi8Var3 = zh8Var3.c;
                    long j = zh8Var3.b;
                    int iG3 = zi8Var3 != null ? zi8.g(zi8Var3.a) : -1;
                    zi8 zi8Var4 = zh8Var3.c;
                    ((InputMethodManager) bVar3.b.getValue()).updateSelection(bVar3.a, zi8.g(j), zi8.f(j), iG3, zi8Var4 != null ? zi8.f(zi8Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.ba6
    public final void g() {
        i(TextInputServiceAndroid$TextInputCommand.d);
    }

    @Override // defpackage.ba6
    public final void h(sy6 sy6Var) {
        Rect rect;
        this.k = new Rect(ok4.V(sy6Var.a), ok4.V(sy6Var.b), ok4.V(sy6Var.c), ok4.V(sy6Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.c, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.m.b(textInputServiceAndroid$TextInputCommand);
        if (this.n == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.c
                /* JADX WARN: Type inference failed for: r0v5, types: [c24, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v14, types: [c24, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    d dVar = this.a;
                    b bVar = dVar.b;
                    dVar.n = null;
                    zb5 zb5Var = dVar.m;
                    View view = dVar.a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        zb5Var.h();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = zb5Var.a;
                    int i = zb5Var.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int iOrdinal = textInputServiceAndroid$TextInputCommand2.ordinal();
                        if (iOrdinal == 0) {
                            Boolean bool = Boolean.TRUE;
                            ref$ObjectRef.a = bool;
                            ref$ObjectRef2.a = bool;
                        } else if (iOrdinal == 1) {
                            Boolean bool2 = Boolean.FALSE;
                            ref$ObjectRef.a = bool2;
                            ref$ObjectRef2.a = bool2;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!js3.i(ref$ObjectRef.a, Boolean.FALSE)) {
                                ref$ObjectRef2.a = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.c);
                            }
                        }
                    }
                    zb5Var.h();
                    if (js3.i(ref$ObjectRef.a, Boolean.TRUE)) {
                        ((InputMethodManager) bVar.b.getValue()).restartInput(bVar.a);
                    }
                    Boolean bool3 = (Boolean) ref$ObjectRef2.a;
                    if (bool3 != null) {
                        if (bool3.booleanValue()) {
                            ((ck4) bVar.c.b).z();
                        } else {
                            ((ck4) bVar.c.b).g();
                        }
                    }
                    if (js3.i(ref$ObjectRef.a, Boolean.FALSE)) {
                        ((InputMethodManager) bVar.b.getValue()).restartInput(bVar.a);
                    }
                }
            };
            this.c.execute(r2);
            this.n = r2;
        }
    }
}
