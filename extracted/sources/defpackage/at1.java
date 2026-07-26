package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment;
import ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog;
import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class at1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ at1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ((DownloadQualityDialogFragment) obj).T0();
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ((FontStyleDialogFragment) obj).T0();
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((GatewayBottomDialogFragment) obj).T0();
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((PikaSelectDeviceBottomDialog) obj).T0();
                break;
            case 4:
                view.removeOnLayoutChangeListener(this);
                ((RecentDownloadBottomDialogFragment) obj).T0();
                break;
            case 5:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
                View view2 = searchView.x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = ca9.a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(rq6.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(rq6.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
            default:
                bo8 bo8Var = (bo8) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                bo8Var.T = iArr[0];
                view.getWindowVisibleDisplayFrame(bo8Var.M);
                break;
        }
    }
}
