package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.ui.focus.c;
import androidx.media3.common.b;
import androidx.paging.LoadType;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.a;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.PushMessageAction;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.InAppNotificationDialogFragment;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.version2.webapi.responsedto.AppLicenseDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.zip.Adler32;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public class pa2 implements cu2, rm1, co3, gb8, wa1, al7 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ pa2(int i, boolean z) {
        this.a = i;
    }

    public static int j(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    public static int l(int[] iArr, int[] iArr2) {
        int iJ = j(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iJ) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    public static ja4 m(ja4 ja4Var, ja4 ja4Var2, ja4 ja4Var3, ja4 ja4Var4) {
        return ja4Var4 == null ? ja4Var3 : ja4Var instanceof ha4 ? (((ja4Var2 instanceof ia4) && (ja4Var4 instanceof ia4)) || (ja4Var4 instanceof ga4)) ? ja4Var4 : ja4Var : ja4Var4;
    }

    public static aw0 n(aw0 aw0Var, na4 na4Var, na4 na4Var2) {
        ja4 ja4Var;
        ja4 ja4Var2;
        ja4 ja4Var3;
        ja4 ja4Var4 = ia4.c;
        if (aw0Var == null || (ja4Var = aw0Var.a) == null) {
            ja4Var = ja4Var4;
        }
        ja4 ja4Var5 = na4Var.a;
        ja4 ja4VarM = m(ja4Var, ja4Var5, ja4Var5, na4Var2 != null ? na4Var2.a : null);
        if (aw0Var == null || (ja4Var2 = aw0Var.b) == null) {
            ja4Var2 = ja4Var4;
        }
        ja4 ja4VarM2 = m(ja4Var2, ja4Var5, na4Var.b, na4Var2 != null ? na4Var2.b : null);
        if (aw0Var != null && (ja4Var3 = aw0Var.c) != null) {
            ja4Var4 = ja4Var3;
        }
        return new aw0(ja4VarM, ja4VarM2, m(ja4Var4, ja4Var5, na4Var.c, na4Var2 != null ? na4Var2.c : null), na4Var, na4Var2);
    }

    public void A(na4 na4Var, na4 na4Var2) {
        Object value;
        aw0 aw0VarN;
        js3.p(na4Var, "sourceLoadStates");
        l lVar = (l) this.b;
        do {
            value = lVar.getValue();
            aw0 aw0Var = (aw0) value;
            aw0VarN = n(aw0Var, na4Var, na4Var2);
            if (js3.i(aw0Var, aw0VarN)) {
                return;
            }
        } while (!lVar.n(value, aw0VarN));
        Iterator it = ((cw) this.c).iterator();
        while (it.hasNext()) {
            ((dp2) it.next()).invoke(aw0VarN);
        }
    }

    public void B(LoadType loadType, ja4 ja4Var) {
        js3.p(loadType, "type");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            this.c = ja4Var;
        } else if (iOrdinal == 1) {
            this.b = ja4Var;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.d = ja4Var;
        }
    }

    public void C(Map map) {
        nc2 nc2Var = (nc2) this.c;
        synchronized (nc2Var) {
            nc2Var.c = null;
            ((HashMap) nc2Var.b).clear();
            ((HashMap) nc2Var.b).putAll(map);
        }
    }

    public na4 D() {
        return new na4((ja4) this.c, (ja4) this.b, (ja4) this.d);
    }

    public void E(boolean z) {
        mj4 mj4Var = (mj4) this.c;
        if (mj4Var != null) {
            mj4Var.b((lj4) this.b, (View) this.d, z);
        }
    }

    public void H() {
        mj4 mj4Var = (mj4) this.c;
        if (mj4Var != null) {
            mj4Var.c((View) this.d);
        }
    }

    @Override // defpackage.al7
    public void a(h26 h26Var) {
        long jD;
        vy2.t((hm8) this.b);
        String str = j29.a;
        hm8 hm8Var = (hm8) this.b;
        synchronized (hm8Var) {
            try {
                long j = hm8Var.c;
                jD = j != -9223372036854775807L ? j + hm8Var.b : hm8Var.d();
            } finally {
            }
        }
        long jE = ((hm8) this.b).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        b bVar = (b) this.c;
        if (jE != bVar.s) {
            rj2 rj2VarA = bVar.a();
            rj2VarA.r = jE;
            b bVar2 = new b(rj2VarA);
            this.c = bVar2;
            ((cp8) this.d).f(bVar2);
        }
        int iA = h26Var.a();
        ((cp8) this.d).d(iA, h26Var);
        ((cp8) this.d).a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.al7
    public void b(hm8 hm8Var, x72 x72Var, ft8 ft8Var) {
        this.b = hm8Var;
        ft8Var.a();
        ft8Var.b();
        cp8 cp8VarO = x72Var.o(ft8Var.d, 5);
        this.d = cp8VarO;
        cp8VarO.f((b) this.c);
    }

    @Override // defpackage.co3
    public ClipDescription c() {
        return (ClipDescription) this.b;
    }

    @Override // defpackage.co3
    public Uri d() {
        return (Uri) this.c;
    }

    @Override // defpackage.co3
    public Uri f() {
        return (Uri) this.d;
    }

    @Override // defpackage.co3
    public Object g() {
        return null;
    }

    public void h(String str, String str2) {
        pa2 pa2Var = new pa2(17, false);
        ((pa2) this.d).d = pa2Var;
        this.d = pa2Var;
        pa2Var.c = str2;
        pa2Var.b = str;
    }

    public void i(String str, String str2) {
        cy4 cy4Var = new cy4(17, false);
        ((pa2) this.d).d = cy4Var;
        this.d = cy4Var;
        cy4Var.c = str2;
        cy4Var.b = str;
    }

    @Override // defpackage.wa1
    public xa1 k() {
        return new is5((cl0) this.d, (String) this.b, (nc2) this.c);
    }

    public Bitmap o(BitmapFactory.Options options) {
        switch (this.a) {
            case 2:
                return i3.d(new kj0(lj0.c((ByteBuffer) this.c)), options, this);
            case 3:
                a aVar = (a) ((pt2) this.c).b;
                aVar.reset();
                return i3.d(aVar, options, this);
            default:
                return i3.c(((com.bumptech.glide.load.data.a) this.d).a().getFileDescriptor(), options, this);
        }
    }

    @Override // defpackage.rm1
    public void onCancel() {
        InAppNotificationDialogFragment inAppNotificationDialogFragment = (InAppNotificationDialogFragment) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.size() == 2) {
            InAppNotificationDialogFragment.U0(inAppNotificationDialogFragment, ((PushMessage) this.c).f(), ((PushMessageAction) arrayList.get(1)).b(), CallbackUrlType.g);
            InAppNotificationDialogFragment.T0(inAppNotificationDialogFragment, DialogResult.b, ((PushMessageAction) arrayList.get(1)).a());
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        dw1.y("popup_ok");
        InAppNotificationDialogFragment inAppNotificationDialogFragment = (InAppNotificationDialogFragment) this.d;
        String strN = ((PushMessage) this.c).n();
        ArrayList arrayList = (ArrayList) this.b;
        InAppNotificationDialogFragment.U0(inAppNotificationDialogFragment, strN, ((PushMessageAction) arrayList.get(0)).b(), CallbackUrlType.e);
        InAppNotificationDialogFragment.T0(inAppNotificationDialogFragment, DialogResult.a, ((PushMessageAction) arrayList.get(0)).a());
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        AppLicenseDTO appLicenseDTO = (AppLicenseDTO) obj;
        Objects.toString(appLicenseDTO);
        int responseCode = appLicenseDTO.getResponseCode();
        if ((responseCode == 0 && !TextUtils.isEmpty(appLicenseDTO.getInvoice()) && !TextUtils.isEmpty(appLicenseDTO.getSignature())) || responseCode == 1) {
            ((t0) this.c).D(new ce5(responseCode, appLicenseDTO.getInvoice(), appLicenseDTO.getSignature()));
            return;
        }
        lw.g(null, "Bad response", appLicenseDTO);
        ((t15) this.b).j(new ErrorDTO(-1, "Bad response: " + appLicenseDTO, ((be5) this.d).i.q.getString(rs6.error_dto_default_message)));
    }

    public ja4 p(LoadType loadType) {
        js3.p(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return (ja4) this.c;
        }
        if (iOrdinal == 1) {
            return (ja4) this.b;
        }
        if (iOrdinal == 2) {
            return (ja4) this.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public ImageHeaderParser$ImageType q() throws Throwable {
        switch (this.a) {
            case 2:
                return ok4.G((List) this.b, lj0.c((ByteBuffer) this.c));
            case 3:
                List list = (List) this.d;
                a aVar = (a) ((pt2) this.c).b;
                aVar.reset();
                return ok4.F(list, aVar, (dr3) this.b);
            default:
                List list2 = (List) this.b;
                com.bumptech.glide.load.data.a aVar2 = (com.bumptech.glide.load.data.a) this.d;
                dr3 dr3Var = (dr3) this.c;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    ei3 ei3Var = (ei3) list2.get(i);
                    a aVar3 = null;
                    try {
                        FileDescriptor fileDescriptor = aVar2.a().getFileDescriptor();
                        a aVar4 = new a(io.sentry.config.a.h(new FileInputStream(fileDescriptor), fileDescriptor), dr3Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ei3Var.d(aVar4);
                            aVar4.d();
                            aVar2.a();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            aVar3 = aVar4;
                            if (aVar3 != null) {
                                aVar3.d();
                            }
                            aVar2.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public sy3 r() {
        sy3 sy3Var = (sy3) this.b;
        if (sy3Var != null) {
            return sy3Var;
        }
        js3.V("keyboardActions");
        throw null;
    }

    @Override // defpackage.cu2
    public void s(Context context, String str) {
        String strConcat;
        js3.p(str, "adId");
        String strA = wq2.A();
        String strX = wq2.x();
        String strI = wq2.I();
        String strZ = wq2.z();
        NetworkInfo networkInfoR = s7.r(context);
        String typeName = networkInfoR != null ? networkInfoR.getTypeName() : null;
        FeedbackViewModel feedbackViewModel = (FeedbackViewModel) this.c;
        c5 c5Var = feedbackViewModel.y;
        String strB = c5Var.b();
        String str2 = (String) this.b;
        String str3 = "";
        String strN = TextUtils.isEmpty(str2) ? "" : dw1.n("\\nPhone: ", str2);
        String strA2 = c5Var.a();
        feedbackViewModel.z.getClass();
        String strA3 = fw4.a();
        String strY = wq2.y(context);
        dp2 dp2Var = (dp2) this.d;
        String str4 = f88.n0(strA3) ? null : strA3;
        if (str4 != null && (strConcat = "\\nmiuiInfo:  ".concat(str4)) != null) {
            str3 = strConcat;
        }
        StringBuilder sbT = rm7.t("Device: ", strI, "  ", strA, "  ");
        o40.I(strZ, "  \\nApi:  ", strX, " \\nMyket Version:  1028 \\nConnection type: ", sbT);
        o40.I(typeName, " \\nUuid:  ", strB, " \\nAccountId:  ", sbT);
        o40.I(strA2, " ", strN, " \\nAdId:  ", sbT);
        o40.I(str, " \\nAndroidId:  ", strY, " \\nPackageName:  ir.mservices.market \\nStore:  myket \\Platform:  myket ", sbT);
        sbT.append(str3);
        dp2Var.invoke(sbT.toString());
    }

    /* JADX WARN: Finally extract failed */
    public boolean t() throws Throwable {
        switch (this.a) {
            case 2:
                List list = (List) this.b;
                ByteBuffer byteBufferC = lj0.c((ByteBuffer) this.c);
                dr3 dr3Var = (dr3) this.d;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((ei3) list.get(i)).e(byteBufferC, dr3Var)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 3:
                List list2 = (List) this.d;
                a aVar = (a) ((pt2) this.c).b;
                aVar.reset();
                dr3 dr3Var2 = (dr3) this.b;
                aVar.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zC = ((ei3) list2.get(i2)).c(aVar, dr3Var2);
                        aVar.reset();
                        if (zC) {
                            return true;
                        }
                    } catch (Throwable th) {
                        aVar.reset();
                        throw th;
                    }
                }
                return false;
            default:
                List list3 = (List) this.b;
                com.bumptech.glide.load.data.a aVar2 = (com.bumptech.glide.load.data.a) this.d;
                dr3 dr3Var3 = (dr3) this.c;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ei3 ei3Var = (ei3) list3.get(i3);
                    a aVar3 = null;
                    try {
                        FileDescriptor fileDescriptor = aVar2.a().getFileDescriptor();
                        a aVar4 = new a(io.sentry.config.a.h(new FileInputStream(fileDescriptor), fileDescriptor), dr3Var3);
                        try {
                            boolean zC2 = ei3Var.c(aVar4, dr3Var3);
                            aVar4.d();
                            aVar2.a();
                            if (zC2) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3 = aVar4;
                            if (aVar3 != null) {
                                aVar3.d();
                            }
                            aVar2.a();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                pa2 pa2Var = (pa2) ((pa2) this.c).d;
                String str = "";
                while (pa2Var != null) {
                    Object obj = pa2Var.c;
                    sb.append(str);
                    String str2 = (String) pa2Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    pa2Var = (pa2) pa2Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 25:
                String str3 = (String) this.d;
                String str4 = (String) this.b;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.c;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str4 != null) {
                    sb2.append(" action=");
                    sb2.append(str4);
                }
                if (str3 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str3);
                }
                sb2.append(" }");
                String string = sb2.toString();
                js3.o(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public boolean u() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.b = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.c).readLine();
                this.b = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.b = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public String v() {
        if (!u()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    public Object w(to6 to6Var, ps0 ps0Var, to6 to6Var2, ry0 ry0Var) {
        String value;
        js3.p(to6Var2, "scopeQualifier");
        StringBuilder sb = new StringBuilder();
        dw1.w(ps0Var, sb, ':');
        if (to6Var == null || (value = to6Var.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(to6Var2);
        zp3 zp3Var = (zp3) ((ConcurrentHashMap) this.b).get(sb.toString());
        Object objB = zp3Var != null ? zp3Var.b(ry0Var) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    public boolean x(int i) {
        h18 h18Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            r();
        } else if (i != 1 && i != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (i == 6) {
            lg2 lg2Var = (lg2) this.d;
            if (lg2Var != null) {
                ((c) lg2Var).g(1, true);
                return true;
            }
            js3.V("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (h18Var = (h18) this.c) == null) {
                return false;
            }
            ((cj1) h18Var).a();
            return true;
        }
        lg2 lg2Var2 = (lg2) this.d;
        if (lg2Var2 != null) {
            ((c) lg2Var2).g(2, true);
            return true;
        }
        js3.V("focusManager");
        throw null;
    }

    public void y(d30 d30Var, int i, boolean z) {
        char c;
        z20 z20Var = (z20) this.d;
        Context context = (Context) this.c;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = d30Var.a;
        String str2 = d30Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        Priority priority = d30Var.c;
        adler32.update(byteBufferAllocate.putInt(gk6.a(priority)).array());
        byte[] bArr = d30Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        wn5.x("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", d30Var);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((qb7) ((i42) this.b)).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(gk6.a(priority))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(z20Var.a(priority, jLongValue, i));
            Set set = ((a30) z20Var.b.get(priority)).c;
            if (set.contains(SchedulerConfig$Flag.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(SchedulerConfig$Flag.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(SchedulerConfig$Flag.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", gk6.a(priority));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(z20Var.a(priority, jLongValue, i));
            Integer numValueOf2 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = d30Var;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[4] = numValueOf2;
            if (Log.isLoggable(wn5.O("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void z(na4 na4Var) {
        js3.p(na4Var, "states");
        this.c = na4Var.a;
        this.d = na4Var.c;
        this.b = na4Var.b;
    }

    public /* synthetic */ pa2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ pa2(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public pa2(Context context, c75 c75Var, d dVar) {
        this.a = 19;
        js3.p(c75Var, "movieService");
        js3.p(dVar, "movieProgressManager");
        this.c = context;
        this.b = c75Var;
        this.d = dVar;
    }

    public pa2(List list) {
        this.a = 14;
        this.d = list;
        this.c = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.c).add(new ls7((List) ((zi4) list.get(i)).b.b));
            ((ArrayList) this.b).add(((zi4) list.get(i)).c.a());
        }
    }

    private final void F() {
    }

    private final void G() {
    }

    @Override // defpackage.co3
    public void e() {
    }

    public pa2(Context context, c75 c75Var, ir.mservices.market.core.notification.a aVar) {
        this.a = 20;
        js3.p(c75Var, "movieService");
        js3.p(aVar, "notificationController");
        this.c = context;
        this.b = c75Var;
        this.d = aVar;
    }

    public pa2(oy6 oy6Var) {
        this.a = 26;
        this.c = new AtomicInt(0);
        this.b = new rb4(2);
        this.d = new xv3(this, oy6Var, 10);
    }

    public pa2(int[] iArr, int[] iArr2, qp2 qp2Var) {
        this.a = 11;
        this.c = iArr;
        g.e(j(iArr));
        this.b = iArr2;
        this.d = g.e(l(iArr, iArr2));
        Integer numQ0 = ew.Q0(iArr);
        new b34(numQ0 != null ? numQ0.intValue() : 0, 90, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
    }

    public pa2(h18 h18Var) {
        this.a = 9;
        this.c = h18Var;
    }

    public pa2(mz3 mz3Var) {
        this.a = 7;
        this.c = mz3Var;
        this.b = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public pa2(lj4 lj4Var, View view) {
        Object mj4Var;
        this.a = 15;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            mj4Var = new oj4();
        } else {
            mj4Var = i >= 33 ? new mj4() : null;
        }
        this.c = mj4Var;
        this.b = lj4Var;
        this.d = view;
    }

    public pa2(cl0 cl0Var) {
        this.a = 27;
        this.d = cl0Var;
        this.c = new nc2(7);
    }

    public pa2(String str, int i) {
        this.a = i;
        switch (i) {
            case 28:
                rj2 rj2Var = new rj2();
                rj2Var.l = tv4.m("video/mp2t");
                rj2Var.m = tv4.m(str);
                this.c = new b(rj2Var);
                break;
            default:
                pa2 pa2Var = new pa2(17, false);
                this.c = pa2Var;
                this.d = pa2Var;
                this.b = str;
                break;
        }
    }

    public pa2(j1 j1Var, ArrayList arrayList, dr3 dr3Var) {
        this.a = 3;
        ok4.p(dr3Var, "Argument must not be null");
        this.b = dr3Var;
        ok4.p(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.c = new pt2(j1Var, dr3Var);
    }

    public pa2(int i) {
        this.a = i;
        switch (i) {
            case 22:
                this.c = new cw(1);
                l lVarB = ja1.b(null);
                this.b = lVarB;
                this.d = new rv6(lVarB);
                break;
            case 23:
                ia4 ia4Var = ia4.c;
                this.c = ia4Var;
                this.b = ia4Var;
                this.d = ia4Var;
                break;
            case 29:
                long[] jArr = ce7.a;
                this.c = new rb5();
                break;
            default:
                String string = UUID.randomUUID().toString();
                js3.o(string, "toString(...)");
                ByteString byteString = ByteString.d;
                this.c = fv.w(string);
                this.b = ka5.f;
                this.d = new ArrayList();
                break;
        }
    }

    public pa2(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, dr3 dr3Var) {
        this.a = 4;
        ok4.p(dr3Var, "Argument must not be null");
        this.c = dr3Var;
        ok4.p(arrayList, "Argument must not be null");
        this.b = arrayList;
        this.d = new com.bumptech.glide.load.data.a(parcelFileDescriptor);
    }

    public pa2(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 1;
        this.d = arrayDeque;
        this.c = bufferedReader;
    }
}
