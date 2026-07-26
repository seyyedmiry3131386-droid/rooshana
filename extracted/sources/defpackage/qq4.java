package defpackage;

import android.content.ContentValues;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.compose.foundation.a;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.collect.ImmutableList;
import io.sentry.android.core.t0;
import ir.mservices.market.app.update.BaseUpdateFragment;
import ir.mservices.market.views.FastDownloadView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class qq4 implements om4, s82, m67, il0, l51, b72, q03 {
    public static final String[] c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};
    public Object a;
    public Object b;

    public /* synthetic */ qq4(Object obj) {
        this.a = obj;
    }

    public static Bundle H(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        l(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            t0.d("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.qq4 d(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            qq4 r2 = new qq4     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            io.sentry.android.core.t0.e(r3, r4, r2)
            if (r0 == 0) goto L42
            r0.release()     // Catch: java.io.IOException -> L42
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.d(android.content.Context):qq4");
    }

    public static void l(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = qq4.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public void A() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException e) {
            t0.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void B(Set set) throws DatabaseIOException {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((h48) this.a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void C() {
        if (((zm3) this.b) != null) {
            this.b = null;
            ((a) this.a).J0(true);
        }
    }

    public void D(long j, long j2, String str) throws DatabaseIOException {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((h48) this.a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void E(mq4 mq4Var, Handler handler) {
        nq4 nq4Var = (nq4) this.a;
        synchronized (nq4Var.d) {
            nq4Var.l = mq4Var;
            nq4Var.a.setCallback(mq4Var.b, handler);
            mq4Var.C(nq4Var, handler);
        }
    }

    public void F(boolean z) {
        r02 r02Var = (r02) ((qq4) ((pj9) this.b).a).b;
        if (r02Var.c != z) {
            if (r02Var.b != null) {
                zz1 zz1VarA = zz1.a();
                q02 q02Var = r02Var.b;
                zz1VarA.getClass();
                wu8.l(q02Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = zz1VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    zz1VarA.b.remove(q02Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            r02Var.c = z;
            if (z) {
                r02.a(r02Var.a, zz1.a().c());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void G(PlaybackStateCompat playbackStateCompat) {
        nq4 nq4Var = (nq4) this.a;
        nq4Var.g = playbackStateCompat;
        synchronized (nq4Var.d) {
            for (int iBeginBroadcast = nq4Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((sf3) nq4Var.f.getBroadcastItem(iBeginBroadcast)).N(playbackStateCompat);
                } catch (RemoteException | SecurityException e) {
                    t0.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nq4Var.f.finishBroadcast();
        }
        MediaSession mediaSession = nq4Var.a;
        if (playbackStateCompat.l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
            builder.setBufferedPosition(playbackStateCompat.c);
            builder.setActions(playbackStateCompat.e);
            builder.setErrorMessage(playbackStateCompat.g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                PlaybackState.CustomAction customActionBuild = customAction.e;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
                    builder2.setExtras(customAction.d);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(playbackStateCompat.j);
            builder.setExtras(playbackStateCompat.k);
            playbackStateCompat.l = builder.build();
        }
        mediaSession.setPlaybackState(playbackStateCompat.l);
    }

    @Override // defpackage.b72
    public int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((ql4) this.a).b;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.b;
        int i = extendedFloatingActionButton2.z0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.b72
    public int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ql4 ql4Var = (ql4) this.a;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return ql4Var.b();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return ql4Var.b();
    }

    @Override // defpackage.il0
    public void e(dl0 dl0Var, h77 h77Var) {
        ((Executor) ((vd1) this.b).c).execute(new ii(this, (il0) this.a, h77Var, 3));
    }

    @Override // defpackage.q03
    public l26 f(n03 n03Var, j03 j03Var) {
        return new nc2(((q03) this.a).f(n03Var, j03Var), (List) this.b, 0);
    }

    public boolean g(int i) {
        return ((vd2) this.a).a.get(i);
    }

    @Override // defpackage.b72
    public int h() {
        return ((ExtendedFloatingActionButton) this.b).S;
    }

    @Override // defpackage.l51
    public Object i(Object obj) {
        Object d87Var;
        j77 j77Var = (j77) obj;
        js3.p(j77Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        nm5 nm5Var = (nm5) this.b;
        px3 px3Var = (px3) this.a;
        tv3 tv3Var = (tv3) nm5Var.b;
        if (Build.VERSION.SDK_INT >= 24) {
            InputStream inputStreamN1 = j77Var.d1().n1();
            pj9 pj9Var = new pj9();
            pj9Var.a = new yp0(inputStreamN1, zp0.a);
            yp0 yp0Var = (yp0) pj9Var.a;
            try {
                nv6 nv6Var = new nv6(pj9Var, pp0.c.d(16384));
                try {
                    Object objE = new c(tv3Var, WriteMode.c, nv6Var, px3Var.getDescriptor(), null).e(px3Var);
                    nv6Var.r();
                    nv6Var.L();
                    yp0Var.getClass();
                    zi0 zi0Var = zi0.c;
                    byte[] bArrArray = yp0Var.c.array();
                    js3.o(bArrArray, "array(...)");
                    zi0Var.getClass();
                    zi0Var.a(bArrArray);
                    d87Var = new e87(objE);
                } catch (Throwable th) {
                    nv6Var.L();
                    throw th;
                }
            } catch (Throwable th2) {
                yp0Var.getClass();
                zi0 zi0Var2 = zi0.c;
                byte[] bArrArray2 = yp0Var.c.array();
                js3.o(bArrArray2, "array(...)");
                zi0Var2.getClass();
                zi0Var2.a(bArrArray2);
                throw th2;
            }
        } else {
            d87Var = new d87();
        }
        return d87Var instanceof d87 ? tv3Var.a(px3Var, j77Var.k()) : ((e87) d87Var).a;
    }

    @Override // defpackage.om4
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public tx c(on onVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((sm4) onVar.a).a;
        tx txVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                tx txVar2 = new tx(mediaCodecCreateByCodecName, (HandlerThread) ((sx) this.a).get(), new vx(mediaCodecCreateByCodecName, (HandlerThread) ((sx) this.b).get()), (gg4) onVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) onVar.d;
                    tx.q(txVar2, (MediaFormat) onVar.b, surface, (MediaCrypto) onVar.e, (surface == null && ((sm4) onVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return txVar2;
                } catch (Exception e) {
                    e = e;
                    txVar = txVar2;
                    if (txVar != null) {
                        txVar.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // defpackage.b72
    public ViewGroup.LayoutParams k() {
        int i = ((ExtendedFloatingActionButton) this.b).z0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    public HashMap m() throws DatabaseIOException {
        try {
            ((String) this.b).getClass();
            Cursor cursorQuery = ((h48) this.a).getReadableDatabase().query((String) this.b, c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new nk0(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        if (r82Var != null) {
            ((BaseUpdateFragment) this.a).T1().F(r82Var);
        }
        ((bn6) this.b).n(fastDownloadView, r82Var);
    }

    @Override // defpackage.il0
    public void o(dl0 dl0Var, Throwable th) {
        ((Executor) ((vd1) this.b).c).execute(new ii(this, (il0) this.a, th, 4));
    }

    @Override // defpackage.b72
    public int p() {
        return ((ExtendedFloatingActionButton) this.b).R;
    }

    @Override // defpackage.m67
    public EncodeStrategy q(sv5 sv5Var) {
        return EncodeStrategy.b;
    }

    @Override // defpackage.q03
    public l26 r() {
        return new nc2(((q03) this.a).r(), (List) this.b, 0);
    }

    @Override // defpackage.r12
    public boolean s(Object obj, File file, sv5 sv5Var) {
        return ((fc0) this.b).s(new qc0((pc0) this.a, ((BitmapDrawable) ((g67) obj).get()).getBitmap()), file, sv5Var);
    }

    public KeyListener t(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((qq4) ((pj9) this.b).a).getClass();
        if (keyListener instanceof i02) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new i02(keyListener);
    }

    public void u(long j) throws DatabaseIOException {
        h48 h48Var = (h48) this.a;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (p49.a(h48Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = h48Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    p49.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void v(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, lu6.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(lu6.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            F(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public f02 w(InputConnection inputConnection, EditorInfo editorInfo) {
        pj9 pj9Var = (pj9) this.b;
        if (inputConnection == null) {
            pj9Var.getClass();
            inputConnection = null;
        } else {
            qq4 qq4Var = (qq4) pj9Var.a;
            qq4Var.getClass();
            if (!(inputConnection instanceof f02)) {
                inputConnection = new f02((EditText) qq4Var.a, inputConnection, editorInfo);
            }
        }
        return (f02) inputConnection;
    }

    public void x(Exception exc, boolean z) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        ImmutableList immutableListN = ImmutableList.n(hashSet);
        hashSet.clear();
        p0 p0VarListIterator = immutableListN.listIterator(0);
        while (p0VarListIterator.hasNext()) {
            ge1 ge1Var = (ge1) p0VarListIterator.next();
            ge1Var.getClass();
            ge1Var.k(exc, z ? 1 : 3);
        }
    }

    public void y(ei2 ei2Var) {
        vg vgVar = (vg) this.b;
        ck4 ck4Var = (ck4) this.a;
        int i = ei2Var.b;
        if (i != 0) {
            vgVar.execute(new bm0(i, 0, ck4Var));
        } else {
            vgVar.execute(new g6(9, ck4Var, ei2Var.a, false));
        }
    }

    public void z(ge1 ge1Var) {
        ((HashSet) this.a).add(ge1Var);
        if (((ge1) this.b) != null) {
            return;
        }
        this.b = ge1Var;
        l52 l52VarC = ge1Var.b.c();
        ge1Var.x = l52VarC;
        ee1 ee1Var = ge1Var.r;
        String str = j29.a;
        l52VarC.getClass();
        ee1Var.getClass();
        ee1Var.obtainMessage(1, new fe1(da4.d.getAndIncrement(), true, SystemClock.elapsedRealtime(), l52VarC)).sendToTarget();
    }

    public /* synthetic */ qq4(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ qq4(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public qq4(String str, ml9 ml9Var, th0 th0Var) {
        this.b = str;
        this.a = ml9Var;
    }

    public qq4(EditText editText, int i) {
        switch (i) {
            case 24:
                this.a = editText;
                r02 r02Var = new r02(editText);
                this.b = r02Var;
                editText.addTextChangedListener(r02Var);
                if (d02.b == null) {
                    synchronized (d02.a) {
                        try {
                            if (d02.b == null) {
                                d02 d02Var = new d02();
                                try {
                                    d02.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, d02.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                d02.b = d02Var;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(d02.b);
                return;
            default:
                this.a = editText;
                pj9 pj9Var = new pj9();
                pj9Var.a = new qq4(editText, 24);
                this.b = pj9Var;
                return;
        }
    }

    public qq4(int i) {
        switch (i) {
            case 20:
                this.a = new HashSet();
                break;
            case 25:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.a = new Rect();
                this.b = new Rect();
                break;
        }
    }
}
