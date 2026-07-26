package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.load.resource.bitmap.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.nearby.zzht;
import com.google.android.gms.internal.nearby.zzif;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.TrackingAppPaymentBottomDialogFragment;
import ir.mservices.market.version2.services.e;
import ir.mservices.market.version2.webapi.requestdto.PurchaseReceiptDto;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class bn6 implements h32, td7, s82, xt1, rm1, al7, ms5, xo1, cb8, yl7, q37, dt5 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ bn6(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.al7
    public void a(h26 h26Var) {
        dt8 dt8Var = (dt8) this.c;
        SparseArray sparseArray = dt8Var.h;
        ao0 ao0Var = (ao0) this.b;
        if (h26Var.x() == 0 && (h26Var.x() & 128) != 0) {
            h26Var.K(6);
            int iA = h26Var.a() / 4;
            for (int i = 0; i < iA; i++) {
                h26Var.h(ao0Var.b, 0, 4);
                ao0Var.q(0);
                int i2 = ao0Var.i(16);
                ao0Var.t(3);
                if (i2 == 0) {
                    ao0Var.t(13);
                } else {
                    int i3 = ao0Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new bl7(new jp8(dt8Var, i3)));
                        dt8Var.n++;
                    }
                }
            }
            if (dt8Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        int i = 21;
        zm9 zm9Var = (zm9) obj;
        cf8 cf8Var = (cf8) obj2;
        switch (this.a) {
            case 23:
                vo4 vo4Var = new vo4(i, cf8Var);
                String str = Build.MODEL;
                String str2 = (String) this.b;
                x41 x41Var = (x41) this.c;
                zm9Var.getClass();
                vl9 vl9Var = new vl9(x41Var);
                zm9Var.g.add(vl9Var);
                kp9 kp9Var = (kp9) zm9Var.getService();
                zzht zzhtVar = new zzht();
                zzhtVar.a = new wm9(vo4Var);
                zzhtVar.d = str;
                zzhtVar.e = str2;
                zzhtVar.g = vl9Var;
                Parcel parcelN0 = kp9Var.n0();
                int i2 = lm9.a;
                parcelN0.writeInt(1);
                zzhtVar.writeToParcel(parcelN0, 0);
                kp9Var.o0(2005, parcelN0);
                break;
            default:
                vo4 vo4Var2 = new vo4(i, cf8Var);
                x41 x41Var2 = (x41) this.b;
                DiscoveryOptions discoveryOptions = (DiscoveryOptions) this.c;
                zm9Var.getClass();
                cm9 cm9Var = new cm9(x41Var2);
                zm9Var.c.add(cm9Var);
                kp9 kp9Var2 = (kp9) zm9Var.getService();
                zzif zzifVar = new zzif();
                zzifVar.a = new wm9(vo4Var2);
                zzifVar.b = NearbyRepository.SERVICE_ID;
                zzifVar.d = discoveryOptions;
                zzifVar.e = cm9Var;
                Parcel parcelN02 = kp9Var2.n0();
                int i3 = lm9.a;
                parcelN02.writeInt(1);
                zzifVar.writeToParcel(parcelN02, 0);
                kp9Var2.o0(2003, parcelN02);
                break;
        }
    }

    @Override // defpackage.td7
    public Object c(Object obj) {
        return ((dp2) this.c).invoke(obj);
    }

    @Override // defpackage.cb8
    public /* synthetic */ ta8 d(byte[] bArr, int i, int i2) {
        return rm7.e(this, bArr, i2);
    }

    @Override // defpackage.yl7
    public int e(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((aj0) this.c).q(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.yl7
    public int f(int i) {
        do {
            i = ((aj0) this.c).v(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.xt1
    public void g() {
        a aVar = (a) this.b;
        synchronized (aVar) {
            aVar.c = aVar.a.length;
        }
    }

    @Override // defpackage.xo1
    public File get() {
        if (((File) this.b) == null) {
            this.b = new File(((Context) this.c).getCacheDir(), "volley");
        }
        return (File) this.b;
    }

    @Override // defpackage.td7
    public Object h(ad7 ad7Var, Object obj) {
        return ((qp2) this.b).invoke(ad7Var, obj);
    }

    @Override // defpackage.xt1
    public void i(pc0 pc0Var, Bitmap bitmap) throws IOException {
        IOException iOException = ((k42) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            pc0Var.c(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        js8.q((Context) this.b, (Uri) this.c, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
    }

    @Override // defpackage.yl7
    public int k(int i) {
        do {
            i = ((aj0) this.c).v(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.yl7
    public int l(int i) {
        do {
            i = ((aj0) this.c).q(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // defpackage.cb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(byte[] r19, int r20, int r21, defpackage.bb8 r22, defpackage.n31 r23) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.m(byte[], int, int, bb8, n31):void");
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        Bundle bundle;
        if (r82Var == null || (bundle = r82Var.k) == null) {
            return;
        }
        String string = bundle.getString("refId");
        String string2 = bundle.getString("BUNDLE_KEY_CALLBACK_URL");
        String string3 = bundle.getString("installCallbackUrl");
        String string4 = bundle.getString("BUNDLE_KEY_DOWNLOAD_REF");
        du duVar = (du) this.c;
        if (duVar != null) {
            duVar.a(r82Var, (FragmentActivity) this.b, sa7.h(string, new mw7(0)), string2, string3, string4);
        } else {
            js3.V("appUtils");
            throw null;
        }
    }

    public Bundle o(String str) {
        js3.p(str, "key");
        bp4 bp4Var = (bp4) this.b;
        if (!bp4Var.b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) bp4Var.h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleC = bundle.containsKey(str) ? t17.c(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            bp4Var.h = null;
        }
        return bundleC;
    }

    @Override // defpackage.rm1
    public void onCommit() {
        String str = (String) this.c;
        TrackingAppPaymentBottomDialogFragment trackingAppPaymentBottomDialogFragment = (TrackingAppPaymentBottomDialogFragment) this.b;
        np8 np8Var = trackingAppPaymentBottomDialogFragment.h1;
        js3.m(np8Var);
        np8Var.v.setStateCommit(MyketProgressState.c);
        np8 np8Var2 = trackingAppPaymentBottomDialogFragment.h1;
        js3.m(np8Var2);
        String strValueOf = String.valueOf(np8Var2.w.getText());
        if (f88.n0(strValueOf) || f88.n0(str)) {
            trackingAppPaymentBottomDialogFragment.R0(DialogResult.a, new Bundle());
            return;
        }
        if (!PhoneNumberUtils.isGlobalPhoneNumber(strValueOf)) {
            Pattern pattern = ul1.a;
            if (!ul1.a.matcher(strValueOf).matches()) {
                String strL = trackingAppPaymentBottomDialogFragment.L(rs6.tracking_app_payment_error);
                np8 np8Var3 = trackingAppPaymentBottomDialogFragment.h1;
                js3.m(np8Var3);
                MyketTextView myketTextView = np8Var3.x;
                myketTextView.setText(strL);
                myketTextView.setVisibility(0);
                np8 np8Var4 = trackingAppPaymentBottomDialogFragment.h1;
                js3.m(np8Var4);
                np8Var4.v.setStateCommit(MyketProgressState.b);
                return;
            }
        }
        np8 np8Var5 = trackingAppPaymentBottomDialogFragment.h1;
        js3.m(np8Var5);
        np8Var5.x.setVisibility(4);
        e eVar = trackingAppPaymentBottomDialogFragment.j1;
        if (eVar != null) {
            eVar.g(new PurchaseReceiptDto(strValueOf), str, trackingAppPaymentBottomDialogFragment, new kp8(trackingAppPaymentBottomDialogFragment), new kp8(trackingAppPaymentBottomDialogFragment));
        } else {
            js3.V("purchasesService");
            throw null;
        }
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        if ((exc instanceof ApiException) && ((ApiException) exc).a.a == 8003) {
            return;
        }
        ((bo9) this.c).h((String) this.b);
    }

    public View p(int i, int i2, int i3, int i4) {
        kg0 kg0Var = (kg0) this.c;
        b69 b69Var = (b69) this.b;
        int iB = b69Var.b();
        int iC = b69Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewD = b69Var.d(i);
            int iA = b69Var.a(viewD);
            int iE = b69Var.e(viewD);
            kg0Var.b = iB;
            kg0Var.c = iC;
            kg0Var.d = iA;
            kg0Var.e = iE;
            if (i3 != 0) {
                kg0Var.a = i3;
                if (kg0Var.a()) {
                    return viewD;
                }
            }
            if (i4 != 0) {
                kg0Var.a = i4;
                if (kg0Var.a()) {
                    view = viewD;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        ViewPager viewPager = (ViewPager) this.c;
        lf9 lf9VarK = q69.k(view, lf9Var);
        if (lf9VarK.a.o()) {
            return lf9VarK;
        }
        Rect rect = (Rect) this.b;
        rect.left = lf9VarK.b();
        rect.top = lf9VarK.d();
        rect.right = lf9VarK.c();
        rect.bottom = lf9VarK.a();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            lf9 lf9VarC = q69.c(viewPager.getChildAt(i), lf9VarK);
            rect.left = Math.min(lf9VarC.b(), rect.left);
            rect.top = Math.min(lf9VarC.d(), rect.top);
            rect.right = Math.min(lf9VarC.c(), rect.right);
            rect.bottom = Math.min(lf9VarC.a(), rect.bottom);
        }
        return lf9VarK.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public pd7 r() {
        pd7 pd7Var;
        bp4 bp4Var = (bp4) this.b;
        synchronized (((ql3) bp4Var.f)) {
            Iterator it = ((LinkedHashMap) bp4Var.g).entrySet().iterator();
            do {
                pd7Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                pd7 pd7Var2 = (pd7) entry.getValue();
                if (js3.i(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    pd7Var = pd7Var2;
                }
            } while (pd7Var == null);
        }
        return pd7Var;
    }

    @Override // defpackage.cb8
    public /* synthetic */ void reset() {
    }

    public String s(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean t(View view) {
        kg0 kg0Var = (kg0) this.c;
        b69 b69Var = (b69) this.b;
        int iB = b69Var.b();
        int iC = b69Var.c();
        int iA = b69Var.a(view);
        int iE = b69Var.e(view);
        kg0Var.b = iB;
        kg0Var.c = iC;
        kg0Var.d = iA;
        kg0Var.e = iE;
        kg0Var.a = 24579;
        return kg0Var.a();
    }

    public void u(String str, pd7 pd7Var) {
        js3.p(pd7Var, "provider");
        bp4 bp4Var = (bp4) this.b;
        synchronized (((ql3) bp4Var.f)) {
            if (((LinkedHashMap) bp4Var.g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) bp4Var.g).put(str, pd7Var);
        }
    }

    public void v() {
        if (!((bp4) this.b).c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        rm rmVar = (rm) this.c;
        if (rmVar == null) {
            rmVar = new rm(this);
        }
        this.c = rmVar;
        try {
            w44.class.getDeclaredConstructor(null);
            rm rmVar2 = (rm) this.c;
            if (rmVar2 != null) {
                ((LinkedHashSet) rmVar2.b).add(w44.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + w44.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public int w(Context context, sl slVar) {
        rq4.n(context);
        rq4.n(slVar);
        int iB = 0;
        if (!slVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = slVar.getMinApkVersion();
        int iX = x(minApkVersion);
        if (iX != -1) {
            return iX;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = ((gu2) this.c).b(context, minApkVersion);
            }
            sparseIntArray.put(minApkVersion, iB);
        }
        return iB;
    }

    public int x(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public void y(o77 o77Var, sk6 sk6Var) {
        zr9 zr9Var = new zr9(sk6Var);
        TreeMap treeMap = (TreeMap) this.b;
        for (Integer num : treeMap.keySet()) {
            xj9 xj9VarA = ((xj9) sk6Var.c).clone();
            xk9 xk9VarB = ((vk9) treeMap.get(num)).b(o77Var, Collections.singletonList(zr9Var));
            int iU = xk9VarB instanceof nk9 ? c67.u(((nk9) xk9VarB).a.doubleValue()) : -1;
            if (iU == 2 || iU == -1) {
                sk6Var.c = xj9VarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            xk9 xk9VarB2 = ((vk9) treeMap2.get((Integer) it.next())).b(o77Var, Collections.singletonList(zr9Var));
            if (xk9VarB2 instanceof nk9) {
                c67.u(((nk9) xk9VarB2).a.doubleValue());
            }
        }
    }

    public /* synthetic */ bn6(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ bn6(bo9 bo9Var, x41 x41Var, DiscoveryOptions discoveryOptions) {
        this.a = 24;
        this.b = x41Var;
        this.c = discoveryOptions;
    }

    public /* synthetic */ bn6(bo9 bo9Var, String str, x41 x41Var) {
        this.a = 23;
        String str2 = Build.MODEL;
        this.b = str;
        this.c = x41Var;
    }

    public bn6(Context context, int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.c = context;
                this.b = null;
                break;
            default:
                rq4.n(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(et6.common_google_play_services_unknown_issue);
                break;
        }
    }

    public bn6(qb8 qb8Var, c5 c5Var) {
        this.a = 10;
        js3.p(qb8Var, "suggestService");
        js3.p(c5Var, "accountManager");
        this.b = qb8Var;
        this.c = c5Var;
    }

    public bn6(Context context, hl7 hl7Var) {
        this.a = 6;
        js3.p(hl7Var, "securityShieldServices");
        this.b = context;
        this.c = hl7Var;
    }

    public bn6(FragmentActivity fragmentActivity) {
        this.a = 7;
        this.b = fragmentActivity;
        this.c = (du) ((w91) ApplicationLauncher.o.b()).B0.get();
    }

    public bn6(Context context, lu7 lu7Var) {
        this.a = 14;
        js3.p(lu7Var, "sharedPreferencesProxy");
        this.b = context;
        this.c = lu7Var;
    }

    @Override // defpackage.rm1
    public void onCancel() {
    }

    public bn6(bp4 bp4Var) {
        this.a = 4;
        this.b = bp4Var;
    }

    public bn6(ExecutorService executorService) {
        this.a = 2;
        this.c = new wv(0);
        this.b = executorService;
    }

    public bn6(b69 b69Var) {
        this.a = 15;
        this.b = b69Var;
        kg0 kg0Var = new kg0();
        kg0Var.a = 0;
        this.c = kg0Var;
    }

    public bn6(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = new h26();
                this.c = new ed9();
                break;
            case 21:
                gu2 gu2Var = gu2.e;
                this.b = new SparseIntArray();
                this.c = gu2Var;
                break;
            case 22:
                break;
            case 27:
                this.b = new TreeMap();
                this.c = new TreeMap();
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public bn6(ViewPager viewPager) {
        this.a = 16;
        this.c = viewPager;
        this.b = new Rect();
    }

    public bn6(dt8 dt8Var) {
        this.a = 12;
        this.c = dt8Var;
        this.b = new ao0(new byte[4], 4);
    }

    @Override // defpackage.al7
    public void b(hm8 hm8Var, x72 x72Var, ft8 ft8Var) {
    }
}
