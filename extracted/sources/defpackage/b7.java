package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        wx wxVar = (wx) this.b;
        synchronized (wxVar.a) {
            try {
                if (wxVar.m) {
                    return;
                }
                long j = wxVar.l - 1;
                wxVar.l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    wxVar.b(new IllegalStateException());
                } else {
                    wxVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        le6 le6Var = (le6) this.b;
        try {
            synchronized (le6Var) {
            }
            try {
                le6Var.a.e(le6Var.c, le6Var.d);
            } finally {
                le6Var.a(true);
            }
        } catch (ExoPlaybackException e) {
            wn5.H("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final void c() {
        ai2 ai2Var = (ai2) this.b;
        synchronized (ai2Var.d) {
            try {
                if (ai2Var.h == null) {
                    return;
                }
                try {
                    hj2 hj2VarD = ai2Var.d();
                    int i = hj2VarD.f;
                    if (i == 2) {
                        synchronized (ai2Var.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Method method = uo8.b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        cv cvVar = ai2Var.c;
                        Context context = ai2Var.a;
                        cvVar.getClass();
                        hj2[] hj2VarArr = {hj2VarD};
                        h27 h27Var = dv8.a;
                        ia7.d("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceC = dv8.a.c(context, hj2VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferJ = j27.j(ai2Var.a, hj2VarD.a);
                            if (mappedByteBufferJ == null || typefaceC == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                vp7 vp7Var = new vp7(typefaceC, c26.L(mappedByteBufferJ));
                                Trace.endSection();
                                synchronized (ai2Var.d) {
                                    try {
                                        ct2 ct2Var = ai2Var.h;
                                        if (ct2Var != null) {
                                            ct2Var.s(vp7Var);
                                        }
                                    } finally {
                                    }
                                }
                                ai2Var.b();
                            } finally {
                                Method method2 = uo8.b;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (ai2Var.d) {
                        try {
                            ct2 ct2Var2 = ai2Var.h;
                            if (ct2Var2 != null) {
                                ct2Var2.q(th2);
                            }
                            ai2Var.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c1  */
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
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7.run():void");
    }

    public /* synthetic */ b7(n62 n62Var, le6 le6Var) {
        this.a = 24;
        this.b = le6Var;
    }
}
