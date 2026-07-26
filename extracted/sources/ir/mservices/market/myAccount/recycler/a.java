package ir.mservices.market.myAccount.recycler;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.g5;
import defpackage.js3;
import defpackage.jx1;
import defpackage.lw;
import defpackage.og5;
import defpackage.qc5;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public g5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, qc5 qc5Var, qc5 qc5Var2) {
        super(view);
        js3.p(qc5Var, "onClickListener");
        js3.p(qc5Var2, "onSpanTextClickListener");
        this.w = qc5Var;
        this.x = qc5Var2;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MyAccountCheckBoxData myAccountCheckBoxData = (MyAccountCheckBoxData) myketRecyclerData;
        js3.p(myAccountCheckBoxData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MyAccountCheckBoxHolder$onAttach$1(null, myAccountCheckBoxData, this), 3);
        bt2.G(cc7.q(view), null, null, new MyAccountCheckBoxHolder$onAttach$2(null, myAccountCheckBoxData, this), 3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MyAccountCheckBoxData myAccountCheckBoxData = (MyAccountCheckBoxData) myketRecyclerData;
        js3.p(myAccountCheckBoxData, "data");
        g5 g5Var = this.y;
        if (g5Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketSwitch myketSwitch = g5Var.v;
        String str = (String) ((Pair) myAccountCheckBoxData.a.a.getValue()).b;
        myketSwitch.setChecked(str != null ? Boolean.parseBoolean(str) : false);
        myketSwitch.setOnTouchListener(new jx1(2, myketSwitch));
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, myAccountCheckBoxData);
        g5 g5Var2 = this.y;
        if (g5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = g5Var2.z;
        myketTextView.setBold(true);
        myketTextView.setTextColor(sj8.b().m);
        myketTextView.setText(view.getResources().getString(rs6.private_mode));
        g5 g5Var3 = this.y;
        if (g5Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = g5Var3.y;
        SpannableString spannableString = new SpannableString(view.getResources().getString(rs6.private_mode_description));
        String string = view.getResources().getString(rs6.more_information);
        js3.o(string, "getString(...)");
        int iL0 = f88.l0(spannableString, string, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(sj8.b().c), iL0, string.length() + iL0, 33);
        myketTextView2.setText(spannableString);
        myketTextView2.setTextColor(sj8.b().n);
        qg5.v(myketTextView2, this.x, this, myAccountCheckBoxData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g5) {
            this.y = (g5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
