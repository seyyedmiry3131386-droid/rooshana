package defpackage;

import android.content.Context;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.m;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.LineMenuBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.UrlDataModel;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class b74 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b74(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                LineMenuBottomDialogFragment lineMenuBottomDialogFragment = (LineMenuBottomDialogFragment) this.c;
                String str = ((LineMenuItemData) this.b).a;
                lineMenuBottomDialogFragment.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("BUNDLE_KEY_ID", str);
                lineMenuBottomDialogFragment.R0(DialogResult.a, bundle);
                break;
            case 1:
                m mVar = (m) this.c;
                Window.Callback callback = mVar.k;
                if (callback != null && mVar.l) {
                    callback.onMenuItemSelected(0, (b6) this.b);
                    break;
                }
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String str2 = (String) this.b;
                SpannableString spannableString = new SpannableString(str2);
                WebViewActivity webViewActivity = (WebViewActivity) this.c;
                spannableString.setSpan(new AbsoluteSizeSpan(webViewActivity.getResources().getDimensionPixelSize(pq6.font_size_super_huge)), 0, str2.length(), 33);
                if (str2.startsWith("https://")) {
                    spannableString.setSpan(new ForegroundColorSpan(sj8.b().x), 0, 8, 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) "\n\n");
                xf5 xf5Var = webViewActivity.D0;
                SslCertificate certificate = webViewActivity.F0.D.getCertificate();
                xf5Var.getClass();
                CharSequence charSequence = "";
                if (certificate != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    xf5Var.a(spannableStringBuilder2, certificate.getIssuedTo(), "ISSUED TO:");
                    xf5Var.a(spannableStringBuilder2, certificate.getIssuedBy(), "ISSUED BY:");
                    Date validNotBeforeDate = certificate.getValidNotBeforeDate();
                    Date validNotAfterDate = certificate.getValidNotAfterDate();
                    if (validNotAfterDate != null || validNotBeforeDate != null) {
                        SpannableString spannableStringH = xf5.h("VALIDITY PERIOD:");
                        spannableStringH.setSpan(new AbsoluteSizeSpan(xf5Var.a.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, spannableStringH.length(), 33);
                        spannableStringBuilder2.append((CharSequence) spannableStringH).append((CharSequence) "\n");
                        xf5.b(spannableStringBuilder2, validNotBeforeDate, "Issued On");
                        xf5.b(spannableStringBuilder2, validNotAfterDate, "Expires On");
                    }
                    SpannableStringBuilder spannableStringBuilderReplace = spannableStringBuilder2.replace(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length(), (CharSequence) "");
                    if (spannableStringBuilderReplace != null) {
                        charSequence = spannableStringBuilderReplace;
                    }
                }
                spannableStringBuilder.append((CharSequence) new SpannableString(charSequence));
                pk5.h(webViewActivity, new NavIntentDirections.UrlAlert(new m09(new DialogDataModel(webViewActivity.l0(), "DIALOG_KEY_NO_RESULT"), new UrlDataModel(new SpannableString(spannableStringBuilder)), webViewActivity.getString(rs6.button_ok))));
                break;
        }
    }

    public b74(m mVar) {
        this.a = 1;
        this.c = mVar;
        Context context = mVar.a.getContext();
        CharSequence charSequence = mVar.h;
        b6 b6Var = new b6();
        b6Var.e = 4096;
        b6Var.g = 4096;
        b6Var.l = null;
        b6Var.m = null;
        b6Var.n = false;
        b6Var.o = false;
        b6Var.p = 16;
        b6Var.i = context;
        b6Var.a = charSequence;
        this.b = b6Var;
    }
}
