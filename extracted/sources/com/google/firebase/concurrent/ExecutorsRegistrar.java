package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.c26;
import defpackage.cd0;
import defpackage.d24;
import defpackage.e91;
import defpackage.gx8;
import defpackage.py0;
import defpackage.r64;
import defpackage.so6;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.u40;
import defpackage.vv1;
import defpackage.zi1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final d24 a = new d24(new py0(1));
    public static final d24 b = new d24(new py0(2));
    public static final d24 c = new d24(new py0(3));
    public static final d24 d = new d24(new py0(4));

    public static zi1 a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new zi1(Executors.newFixedThreadPool(4, new e91("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        so6 so6Var = new so6(u40.class, ScheduledExecutorService.class);
        so6[] so6VarArr = {new so6(u40.class, ExecutorService.class), new so6(u40.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(so6Var);
        for (so6 so6Var2 : so6VarArr) {
            c26.p(so6Var2, "Null interface");
        }
        Collections.addAll(hashSet, so6VarArr);
        tx0 tx0Var = new tx0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new vv1(6), hashSet3);
        so6 so6Var3 = new so6(cd0.class, ScheduledExecutorService.class);
        so6[] so6VarArr2 = {new so6(cd0.class, ExecutorService.class), new so6(cd0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(so6Var3);
        for (so6 so6Var4 : so6VarArr2) {
            c26.p(so6Var4, "Null interface");
        }
        Collections.addAll(hashSet4, so6VarArr2);
        tx0 tx0Var2 = new tx0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new vv1(7), hashSet6);
        so6 so6Var5 = new so6(r64.class, ScheduledExecutorService.class);
        so6[] so6VarArr3 = {new so6(r64.class, ExecutorService.class), new so6(r64.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(so6Var5);
        for (so6 so6Var6 : so6VarArr3) {
            c26.p(so6Var6, "Null interface");
        }
        Collections.addAll(hashSet7, so6VarArr3);
        tx0 tx0Var3 = new tx0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new vv1(8), hashSet9);
        sx0 sx0VarA = tx0.a(new so6(gx8.class, Executor.class));
        sx0VarA.g = new vv1(9);
        return Arrays.asList(tx0Var, tx0Var2, tx0Var3, sx0VarA.b());
    }
}
