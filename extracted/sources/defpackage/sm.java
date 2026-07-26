package defpackage;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.activity.ForceCloseReportingActivity;
import ir.mservices.market.activity.Hilt_BaseActivity;
import ir.mservices.market.activity.Hilt_BaseContentActivity;
import ir.mservices.market.activity.Hilt_BaseFragmentContentActivity;
import ir.mservices.market.activity.Hilt_BaseNavigationContentActivity;
import ir.mservices.market.activity.Hilt_ShareActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.activity.PermissionDialogActivity;
import ir.mservices.market.app.detail.update.Hilt_InAppUpdateActivity;
import ir.mservices.market.common.comment.Hilt_CommentActivity;
import ir.mservices.market.core.Hilt_BaseDialogActivity;
import ir.mservices.market.version2.activity.Hilt_LoginActivity;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.activity.ObbMoveActivity;
import ir.mservices.market.version2.activity.ObbMoveBackActivity;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.version2.activity.WebViewActivityImpl.ApplicationPaymentActivity;
import ir.mservices.market.version2.activity.WebViewActivityImpl.InAppPurchaseWebview;

/* JADX INFO: loaded from: classes.dex */
public final class sm implements ct5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentActivity b;

    public /* synthetic */ sm(FragmentActivity fragmentActivity, int i) {
        this.a = i;
        this.b = fragmentActivity;
    }

    @Override // defpackage.ct5
    public final void a(ComponentActivity componentActivity) {
        switch (this.a) {
            case 0:
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.b;
                zm zmVarO = appCompatActivity.O();
                ln lnVar = (ln) zmVarO;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(lnVar.k);
                if (layoutInflaterFrom.getFactory() == null) {
                    layoutInflaterFrom.setFactory2(lnVar);
                } else {
                    layoutInflaterFrom.getFactory2();
                }
                ((bn6) appCompatActivity.d.c).o("androidx:appcompat");
                zmVarO.d();
                break;
            case 1:
                ((ApplicationPaymentActivity) this.b).R();
                break;
            case 2:
                ((Hilt_BaseActivity) this.b).R();
                break;
            case 3:
                ((Hilt_BaseContentActivity) this.b).R();
                break;
            case 4:
                ((Hilt_BaseDialogActivity) this.b).R();
                break;
            case 5:
                ((Hilt_BaseFragmentContentActivity) this.b).R();
                break;
            case 6:
                ((Hilt_BaseNavigationContentActivity) this.b).R();
                break;
            case 7:
                ((Hilt_CommentActivity) this.b).R();
                break;
            case 8:
                ForceCloseReportingActivity forceCloseReportingActivity = (ForceCloseReportingActivity) this.b;
                if (!forceCloseReportingActivity.E) {
                    forceCloseReportingActivity.E = true;
                    w91 w91Var = ((q91) ((kj2) forceCloseReportingActivity.e())).a;
                    forceCloseReportingActivity.G = (d04) w91Var.p.get();
                    forceCloseReportingActivity.H = (pr7) w91Var.s.get();
                }
                break;
            case 9:
                ((InAppPurchaseActivity) this.b).R();
                break;
            case 10:
                ((InAppPurchaseWebview) this.b).R();
                break;
            case 11:
                ((Hilt_InAppUpdateActivity) this.b).R();
                break;
            case 12:
                ((LaunchContentActivity) this.b).R();
                break;
            case 13:
                ((Hilt_LoginActivity) this.b).R();
                break;
            case 14:
                ((ObbMoveActivity) this.b).R();
                break;
            case 15:
                ((ObbMoveBackActivity) this.b).R();
                break;
            case 16:
                ((PermissionDialogActivity) this.b).R();
                break;
            case 17:
                ((Hilt_ShareActivity) this.b).R();
                break;
            default:
                ((WebViewActivity) this.b).R();
                break;
        }
    }
}
