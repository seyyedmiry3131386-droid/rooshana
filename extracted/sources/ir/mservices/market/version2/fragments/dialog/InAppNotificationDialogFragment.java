package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import defpackage.bt2;
import defpackage.fa1;
import defpackage.jn1;
import defpackage.js6;
import defpackage.lk3;
import defpackage.lw;
import defpackage.nt6;
import defpackage.pa2;
import defpackage.pq6;
import defpackage.ql0;
import defpackage.sj8;
import defpackage.t61;
import defpackage.vv2;
import defpackage.zy2;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.PushMessageAction;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InAppNotificationDialogFragment extends zy2 {
    public lk3 c1;
    public final Object d1;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.dialog.InAppNotificationDialogFragment$1, reason: invalid class name */
    class AnonymousClass1 extends TypeToken<List<PushMessageAction>> {
    }

    public InAppNotificationDialogFragment() {
        super(3);
        this.d1 = bt2.D(ir.myket.callback.manager.a.class);
    }

    public static void T0(InAppNotificationDialogFragment inAppNotificationDialogFragment, DialogResult dialogResult, String str) {
        if (TextUtils.isEmpty(str)) {
            inAppNotificationDialogFragment.z0();
            return;
        }
        FragmentActivity fragmentActivityF = inAppNotificationDialogFragment.F();
        if (str != null) {
            t61.w(str, "parse(...)", fragmentActivityF, null, null);
        }
        inAppNotificationDialogFragment.N0(dialogResult, new Bundle());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
    public static void U0(InAppNotificationDialogFragment inAppNotificationDialogFragment, String str, String str2, CallbackUrlType callbackUrlType) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ir.myket.callback.manager.a) inAppNotificationDialogFragment.d1.getValue()).b(new ql0(Uri.parse(str).buildUpon().appendQueryParameter("actionId", str2).build().toString(), callbackUrlType));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = jn1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        jn1 jn1Var = (jn1) fa1.c(layoutInflaterFrom, js6.dialog_in_app_notification, null, false);
        View view = jn1Var.l;
        MyketTextView myketTextView = jn1Var.v;
        DialogHeaderComponent dialogHeaderComponent = jn1Var.x;
        DialogButtonComponent dialogButtonComponent = jn1Var.w;
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(true);
        PushMessage pushMessage = this.c1.b;
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = (ArrayList) new vv2().b(pushMessage.h(), TypeToken.get(new AnonymousClass1().getType()));
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
        } catch (Exception e) {
            lw.g(e, "Could not parse in-app notification json in extra field!", null);
        }
        dialogHeaderComponent.setTitle(pushMessage.s());
        dialogHeaderComponent.setSubtitle(pushMessage.g());
        dialogHeaderComponent.setImage(pushMessage.i(), pq6.dialog_header_circle_image_size);
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        jn1Var.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        if (TextUtils.isEmpty(pushMessage.l())) {
            myketTextView.setVisibility(8);
        } else {
            myketTextView.setText(pushMessage.l());
            myketTextView.setVisibility(0);
        }
        if (arrayList.isEmpty()) {
            dialogButtonComponent.setVisibility(8);
        } else if (arrayList.size() == 1) {
            dialogButtonComponent.setVisibility(0);
            dialogButtonComponent.setTitles(((PushMessageAction) arrayList.get(0)).c(), null);
        } else if (arrayList.size() == 2) {
            dialogButtonComponent.setVisibility(0);
            dialogButtonComponent.setTitles(((PushMessageAction) arrayList.get(0)).c(), ((PushMessageAction) arrayList.get(1)).c());
        }
        dialogButtonComponent.setOnClickListener(new pa2(this, pushMessage, arrayList, false, 5));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String J0() {
        return this.c1.b.s();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.c1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.zy2, ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.c1 = lk3.fromBundle(p0());
        super.W(context);
    }
}
