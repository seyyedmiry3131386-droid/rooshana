package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.TrackSelectionView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.timepicker.l;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.ui.crop.CropImageView;
import ir.mservices.market.version2.ui.crop.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.a;
        boolean z = false;
        boolean z2 = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((k6) obj).a();
                break;
            case 1:
                jd jdVar = (jd) obj;
                Message messageObtain = (view != jdVar.h || (message3 = jdVar.j) == null) ? (view != jdVar.k || (message2 = jdVar.m) == null) ? (view != jdVar.n || (message = jdVar.p) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                jdVar.D.obtainMessage(1, jdVar.b).sendToTarget();
                break;
            case 2:
                if0 if0Var = (if0) obj;
                if (if0Var.k && if0Var.isShowing()) {
                    if (!if0Var.m) {
                        TypedArray typedArrayObtainStyledAttributes = if0Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        if0Var.l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        if0Var.m = true;
                    }
                    if (if0Var.l) {
                        if0Var.cancel();
                    }
                    break;
                }
                break;
            case 3:
                CropContentFragment cropContentFragment = (CropContentFragment) obj;
                if (cropContentFragment.W0.getDrawable() != null && !cropContentFragment.W0.L) {
                    pk5.h(cropContentFragment.J0, new NavIntentDirections.Progress(new em6(new DialogDataModel(cropContentFragment.getClass().getSimpleName() + "_" + cropContentFragment.H0, "DIALOG_KEY_NO_RESULT"), true)));
                    CropImageView cropImageView = cropContentFragment.W0;
                    String str = System.currentTimeMillis() + "_cropped.png";
                    g76 g76Var = cropContentFragment.V0;
                    FragmentActivity fragmentActivityF = cropContentFragment.F();
                    g76Var.getClass();
                    Uri uriFromFile = Uri.fromFile(new File(g76.b(fragmentActivityF), str));
                    pj9 pj9Var = new pj9(cropContentFragment);
                    ca7 ca7Var = new ca7(16, cropContentFragment);
                    cropImageView.E = uriFromFile;
                    cropImageView.z = pj9Var;
                    cropImageView.A = ca7Var;
                    if (!cropImageView.L) {
                        cropImageView.L = true;
                        cropImageView.B.submit(new b(cropImageView));
                    } else {
                        cropImageView.s(pj9Var);
                        cropImageView.s(cropImageView.A);
                    }
                    break;
                }
                break;
            case 4:
                DetailToolbarView detailToolbarView = (DetailToolbarView) obj;
                int iOrdinal = detailToolbarView.s.d(detailToolbarView.getPackageName(), detailToolbarView.getVersionCode(), detailToolbarView.D(), detailToolbarView.getForceUpdate()).ordinal();
                if (iOrdinal == 0) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("button_incompatible_" + detailToolbarView.A);
                    clickEventBuilder.a();
                    break;
                } else if (iOrdinal == 1) {
                    detailToolbarView.E();
                    break;
                } else if (iOrdinal == 2) {
                    DetailToolbarView.y(detailToolbarView);
                    break;
                } else if (iOrdinal == 4) {
                    DetailToolbarView.x(detailToolbarView);
                    break;
                }
                break;
            case 5:
                LaunchContentActivity launchContentActivity = (LaunchContentActivity) obj;
                int i2 = LaunchContentActivity.B1;
                launchContentActivity.getClass();
                RecentDownloadType[] recentDownloadTypeArr = RecentDownloadType.c;
                pk5.h(launchContentActivity, new NavIntentDirections.DownloadList(new rr1("APPS".toLowerCase())));
                xz7 xz7Var = launchContentActivity.s1;
                if (xz7Var != null) {
                    xz7Var.a(3);
                }
                break;
            case 6:
                vt4 itemData = ((NavigationBarItemView) view).getItemData();
                NavigationBarMenuView navigationBarMenuView = (NavigationBarMenuView) obj;
                boolean zQ = navigationBarMenuView.M.a.q(itemData, navigationBarMenuView.L, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!zQ || itemData.isChecked()) {
                        navigationBarMenuView.setCheckedItem(itemData);
                    }
                    break;
                }
                break;
            case 7:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                bl5 bl5Var = (bl5) obj;
                tk5 tk5Var = bl5Var.e;
                if (tk5Var != null) {
                    tk5Var.f = true;
                }
                vt4 itemData2 = navigationMenuItemView.getItemData();
                boolean zQ2 = bl5Var.c.q(itemData2, bl5Var, 0);
                if (itemData2 != null && itemData2.isCheckable() && zQ2) {
                    bl5Var.e.y(itemData2);
                } else {
                    z2 = false;
                }
                tk5 tk5Var2 = bl5Var.e;
                if (tk5Var2 != null) {
                    tk5Var2.f = false;
                }
                if (z2) {
                    bl5Var.c(false);
                }
                break;
            case 8:
                ((l) obj).b(((Integer) view.getTag(qr6.selection_type)).intValue());
                break;
            case 9:
                ((Toolbar) obj).d();
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                HashMap map = trackSelectionView.g;
                if (view == trackSelectionView.c) {
                    trackSelectionView.l = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    map.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    ip8 ip8Var = (ip8) tag;
                    qp8 qp8Var = ip8Var.a;
                    yo8 yo8Var = qp8Var.b;
                    int i3 = ip8Var.b;
                    ep8 ep8Var = (ep8) map.get(yo8Var);
                    if (ep8Var == null) {
                        if (!trackSelectionView.i && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(yo8Var, new ep8(yo8Var, ImmutableList.s(Integer.valueOf(i3))));
                    } else {
                        ArrayList arrayList = new ArrayList(ep8Var.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z3 = trackSelectionView.h && qp8Var.c;
                        if (z3 || (trackSelectionView.i && trackSelectionView.f.size() > 1)) {
                            z = true;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i3));
                            if (arrayList.isEmpty()) {
                                map.remove(yo8Var);
                            } else {
                                map.put(yo8Var, new ep8(yo8Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z3) {
                                arrayList.add(Integer.valueOf(i3));
                                map.put(yo8Var, new ep8(yo8Var, arrayList));
                            } else {
                                map.put(yo8Var, new ep8(yo8Var, ImmutableList.s(Integer.valueOf(i3))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
