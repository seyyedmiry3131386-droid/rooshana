package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.util.SparseBooleanArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.b;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.reflect.TypeToken;
import io.sentry.android.core.t0;
import ir.mservices.market.app.bookmark.data.BookmarkApplicationListDto;
import ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.login.ui.LoginDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppFailedStorageDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.DocumentFilePermissionDialogFragment;
import ir.mservices.market.version2.manager.install.InstallConsumer$MutexState;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ql4 implements fu4, rm1, ay4, ms5, h32, z99, fl0, ef1, b72, wh2, cu2, r7 {
    public static final int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ql4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void B(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    public void C(long j) {
        long jB = jj8.b(j);
        byte b = 0;
        if (!kj8.a(jB, 0L)) {
            if (kj8.a(jB, 4294967296L)) {
                b = 1;
            } else if (kj8.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        A(b);
        if (kj8.a(jj8.b(j), 0L)) {
            return;
        }
        B(jj8.c(j));
    }

    public Object D(no7 no7Var, av avVar) {
        js3.p(no7Var, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.b).get(no7Var);
        Object obj = map != null ? map.get(avVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void F(Bundle bundle, String str, List list) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", yh0.q(list, MediaBrowserCompat$MediaItem.CREATOR));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle2);
        ((Messenger) this.b).send(messageObtain);
    }

    public void G(int i) {
        xe1 xe1Var = (xe1) this.b;
        vy2.s(!xe1Var.a);
        ((SparseBooleanArray) xe1Var.b).delete(i);
    }

    public Class H() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("java.util.function.Consumer");
        js3.o(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    @Override // defpackage.b72
    public int a() {
        return ((ExtendedFloatingActionButton) this.b).getMeasuredHeight();
    }

    @Override // defpackage.b72
    public int b() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.R + extendedFloatingActionButton.S;
    }

    @Override // defpackage.ay4
    public void c() {
        ((AppSubReviewsFragment) this.b).T1();
        fw0.c("_review");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wh2
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                d1.m((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // defpackage.fu4
    public void d(ot4 ot4Var, boolean z) {
        if (ot4Var instanceof p98) {
            ((p98) ot4Var).z.k().c(false);
        }
        fu4 fu4Var = ((b) this.b).e;
        if (fu4Var != null) {
            fu4Var.d(ot4Var, z);
        }
    }

    @Override // defpackage.ay4
    public void e() {
        ((AppSubReviewsFragment) this.b).T1();
        fw0.e("_review");
    }

    @Override // defpackage.ef1
    public int f() {
        return (o() << 8) | o();
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        zo3 zo3Var = (zo3) this.b;
        PendingInstall pendingInstall = zo3Var.g;
        InstallConsumer$MutexState installConsumer$MutexState = InstallConsumer$MutexState.a;
        if (pendingInstall == null) {
            zo3Var.e(installConsumer$MutexState);
        } else if (activityResult.a == -1) {
            zo3Var.d(pendingInstall);
        } else {
            zo3Var.o.h(pendingInstall.getPackageName());
            zo3Var.e(installConsumer$MutexState);
        }
    }

    @Override // defpackage.b72
    public int h() {
        return ((ExtendedFloatingActionButton) this.b).S;
    }

    @Override // defpackage.fl0
    public Type i() {
        return (Type) this.b;
    }

    @Override // defpackage.h32
    public /* bridge */ /* synthetic */ void j(Serializable serializable) {
    }

    @Override // defpackage.b72
    public ViewGroup.LayoutParams k() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // defpackage.fu4
    public boolean l(ot4 ot4Var) {
        b bVar = (b) this.b;
        if (ot4Var == bVar.c) {
            return false;
        }
        bVar.y = ((p98) ot4Var).A.a;
        fu4 fu4Var = bVar.e;
        if (fu4Var != null) {
            return fu4Var.l(ot4Var);
        }
        return false;
    }

    @Override // defpackage.wh2
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            t0.n("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.fl0
    public Object n(dl0 dl0Var) {
        jx0 jx0Var = new jx0(dl0Var);
        dl0Var.l0(new ix0(jx0Var, 0));
        return jx0Var;
    }

    @Override // defpackage.ef1
    public short o() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 5:
                ((AppFailedStorageDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
            case 16:
                ((DocumentFilePermissionDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 5:
                ((AppFailedStorageDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
            case 16:
                ((DocumentFilePermissionDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
            default:
                ((LoginDialogFragment) this.b).f1();
                break;
        }
    }

    @Override // defpackage.b72
    public int p() {
        return ((ExtendedFloatingActionButton) this.b).R;
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        r90 r90Var = (r90) this.b;
        r90Var.o = lf9Var.a();
        r90Var.p = lf9Var.b();
        r90Var.q = lf9Var.c();
        r90Var.g();
        return lf9Var;
    }

    @Override // defpackage.ef1
    public int r(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // defpackage.cu2
    public void s(Context context, String str) {
        js3.p(str, "adId");
        ((du2) this.b).i(true);
    }

    @Override // defpackage.ef1
    public long skip(long j) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        boolean z;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        if (bottomAppBar.m) {
            bottomAppBar.t = lf9Var.a();
        }
        boolean z2 = false;
        if (bottomAppBar.n) {
            z = bottomAppBar.v != lf9Var.b();
            bottomAppBar.v = lf9Var.b();
        } else {
            z = false;
        }
        if (bottomAppBar.o) {
            boolean z3 = bottomAppBar.u != lf9Var.c();
            bottomAppBar.u = lf9Var.c();
            z2 = z3;
        }
        if (!z && !z2) {
            return lf9Var;
        }
        AnimatorSet animatorSet = bottomAppBar.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.M();
        bottomAppBar.L();
        return lf9Var;
    }

    public void u(dr0 dr0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = dr0Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(dr0Var.e[0]), dr0Var);
    }

    public void v(int i, boolean z) {
        xe1 xe1Var = (xe1) this.b;
        if (z) {
            xe1Var.a(i);
        } else {
            xe1Var.getClass();
        }
    }

    public cb6 w() {
        return new cb6(((xe1) this.b).h());
    }

    public long x(qj1 qj1Var, vg6 vg6Var) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.b;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? fz.l(viewConfiguration) : qj1Var.S(64));
        float f2 = -(i > 26 ? fz.j(viewConfiguration) : qj1Var.S(64));
        List list = vg6Var.a;
        nr5 nr5Var = new nr5(0L);
        int size = list.size();
        int i2 = 0;
        while (true) {
            long j = nr5Var.a;
            if (i2 >= size) {
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)));
            }
            nr5Var = new nr5(nr5.g(j, ((ah6) list.get(i2)).j));
            i2++;
        }
    }

    public q31 y(Object obj, ps0 ps0Var, Activity activity2, dp2 dp2Var) throws IllegalAccessException, InvocationTargetException {
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) this.b, new Class[]{H()}, new p31(ps0Var, dp2Var));
        js3.o(objNewProxyInstance, "newProxyInstance(...)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, H()).invoke(obj, activity2, objNewProxyInstance);
        return new q31(obj.getClass().getMethod("removeWindowLayoutInfoListener", H()), obj, objNewProxyInstance);
    }

    public Object z(Object obj, BookmarkDeleteRequestDto bookmarkDeleteRequestDto, ContinuationImpl continuationImpl) {
        td0 td0Var = (td0) this.b;
        z57 z57VarCreateRequestUrl = td0Var.createRequestUrl("v1/bookmarks", "", null, td0Var.getCommonQueryParam());
        Type type = new TypeToken<BookmarkApplicationListDto>() { // from class: ir.mservices.market.app.bookmark.services.BookmarkService$deleteBookmark$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.r(td0Var, type, z57VarCreateRequestUrl, bookmarkDeleteRequestDto, obj, continuationImpl);
    }

    public /* synthetic */ ql4(int i, boolean z) {
        this.a = i;
    }

    public ql4(e05 e05Var) {
        this.a = 29;
        js3.p(e05Var, "movieBookmarkService");
        this.b = e05Var;
    }

    public ql4(td0 td0Var) {
        this.a = 4;
        js3.p(td0Var, "bookmarkService");
        this.b = td0Var;
    }

    public ql4(ClassLoader classLoader) {
        this.a = 13;
        js3.p(classLoader, "loader");
        this.b = classLoader;
    }

    public ql4(Context context, kr1 kr1Var) {
        this.a = 21;
        this.b = new GestureDetector(context, kr1Var, null);
    }

    public ql4(Context context, ComponentName componentName, y yVar, Bundle bundle) {
        this.a = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new ol4(context, componentName, yVar, bundle);
        } else {
            this.b = new ml4(context, componentName, yVar, bundle);
        }
    }

    public ql4(Context context, Uri uri) {
        this.a = 20;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public ql4(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new AtomicReference(null);
                break;
            case 11:
                this.b = new LinkedHashMap();
                break;
            case 15:
                this.b = new ConcurrentHashMap(16);
                break;
            case 28:
                this.b = new xw4(500L);
                break;
            default:
                this.b = new xe1(5);
                break;
        }
    }

    private final void E() {
    }

    public ql4(cb6 cb6Var) {
        this.a = 1;
        xe1 xe1Var = new xe1(5);
        this.b = xe1Var;
        xe1Var.b(cb6Var.a);
    }

    public ql4(ByteBuffer byteBuffer) {
        this.a = 14;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
