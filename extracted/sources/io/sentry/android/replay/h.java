package io.sentry.android.replay;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cc2;
import defpackage.dp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.m91;
import defpackage.ry7;
import defpackage.u21;
import defpackage.zp0;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable {
    public final b6 a;
    public final io.sentry.protocol.v b;
    public final AtomicBoolean c;
    public final AutoClosableReentrantLock d;
    public final AutoClosableReentrantLock e;
    public final AutoClosableReentrantLock f;
    public io.sentry.android.replay.video.c g;
    public final c24 h;
    public final ArrayList i;
    public final LinkedHashMap j;
    public final c24 k;

    public h(b6 b6Var, io.sentry.protocol.v vVar) {
        js3.p(b6Var, "options");
        js3.p(vVar, "replayId");
        this.a = b6Var;
        this.b = vVar;
        this.c = new AtomicBoolean(false);
        this.d = new AutoClosableReentrantLock();
        this.e = new AutoClosableReentrantLock();
        this.f = new AutoClosableReentrantLock();
        this.h = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.ReplayCache$replayCacheDir$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                h hVar = this.g;
                b6 b6Var2 = hVar.a;
                io.sentry.protocol.v vVar2 = hVar.b;
                js3.p(b6Var2, "options");
                js3.p(vVar2, "replayId");
                String cacheDirPath = b6Var2.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    b6Var2.getLogger().i(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = b6Var2.getCacheDirPath();
                js3.m(cacheDirPath2);
                File file = new File(cacheDirPath2, "replay_" + vVar2);
                file.mkdirs();
                return file;
            }
        });
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
        this.k = kotlin.a.a(new bp2() { // from class: io.sentry.android.replay.ReplayCache$ongoingSegmentFile$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() throws IOException {
                h hVar = this.g;
                if (hVar.g() == null) {
                    return null;
                }
                File file = new File(hVar.g(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            }
        });
    }

    public final void b(File file, long j, String str) throws Exception {
        i iVar = new i(file, j, str);
        io.sentry.r rVarA = this.f.a();
        try {
            this.i.add(iVar);
            m91.i(rVarA, null);
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        io.sentry.r rVarA = this.d.a();
        try {
            io.sentry.android.replay.video.c cVar = this.g;
            if (cVar != null) {
                cVar.c();
            }
            this.g = null;
            m91.i(rVarA, null);
            this.c.set(true);
        } finally {
        }
    }

    public final void d(File file) {
        b6 b6Var = this.a;
        try {
            if (file.delete()) {
                return;
            }
            b6Var.getLogger().i(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File g() {
        return (File) this.h.getValue();
    }

    public final void k(String str, String str2) throws Exception {
        File file;
        File file2;
        c24 c24Var = this.k;
        LinkedHashMap linkedHashMap = this.j;
        io.sentry.r rVarA = this.e.a();
        try {
            if (this.c.get()) {
                m91.i(rVarA, null);
                return;
            }
            File file3 = (File) c24Var.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) c24Var.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) c24Var.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), zp0.a), 8192);
                try {
                    Iterator it = ((u21) ry7.p(bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listY0 = f88.y0((String) it.next(), new String[]{SimpleComparison.EQUAL_TO_OPERATION}, 2);
                        linkedHashMap.put((String) listY0.get(0), (String) listY0.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) c24Var.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                js3.o(setEntrySet, "<get-entries>(...)");
                String strT0 = kotlin.collections.a.t0(setEntrySet, "\n", null, null, new dp2() { // from class: io.sentry.android.replay.ReplayCache$persistSegmentValues$1$2
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        js3.p(entry, "<name for destructuring parameter 0>");
                        return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
                    }
                }, 30);
                Charset charset = zp0.a;
                js3.p(strT0, ConfirmDTO.INPUT_TYPE_TEXT);
                js3.p(charset, "charset");
                FileOutputStream fileOutputStreamK = io.sentry.config.a.k(new FileOutputStream(file4), file4);
                try {
                    cc2.q0(fileOutputStreamK, strT0, charset);
                    fileOutputStreamK.close();
                } finally {
                }
            }
            m91.i(rVarA, null);
        } finally {
        }
    }

    public final String u(final long j) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        io.sentry.r rVarA = this.f.a();
        try {
            kotlin.collections.a.B0(new dp2() { // from class: io.sentry.android.replay.ReplayCache$rotate$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    i iVar = (i) obj;
                    js3.p(iVar, "it");
                    if (iVar.b < j) {
                        this.d(iVar.a);
                        return Boolean.TRUE;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    if (ref$ObjectRef2.a == null) {
                        ref$ObjectRef2.a = iVar.c;
                    }
                    return Boolean.FALSE;
                }
            }, this.i);
            m91.i(rVarA, null);
            return (String) ref$ObjectRef.a;
        } finally {
        }
    }
}
