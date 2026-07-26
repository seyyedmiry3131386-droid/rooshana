package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.mx7;
import defpackage.nx7;
import defpackage.ox7;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleSelectBottomDialogFragment extends BaseNewBottomDialogFragment {
    public ox7 e1;
    public nx7 f1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        nx7 nx7Var = this.f1;
        if (nx7Var != null) {
            return nx7Var.a;
        }
        js3.V("args");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "SingleSelectBottomDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final ThemeData O0() {
        nx7 nx7Var = this.f1;
        if (nx7Var != null) {
            return nx7Var.e;
        }
        js3.V("args");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        js3.p(context, "context");
        this.f1 = mx7.a(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Y0 = true;
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = ox7.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ox7 ox7Var = (ox7) fa1.c(layoutInflater, js6.single_select_dialog, null, false);
        this.e1 = ox7Var;
        js3.m(ox7Var);
        View view = ox7Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
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
    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.fragments.dialog.SingleSelectBottomDialogFragment.k0(android.view.View, android.os.Bundle):void");
    }
}
