package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 {
    public final t a;

    public static io.sentry.protocol.u c(Throwable th, io.sentry.protocol.n nVar, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.u uVar = new io.sentry.protocol.u();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(list);
            if (z) {
                a0Var.c = Boolean.TRUE;
            }
            uVar.e = a0Var;
        }
        uVar.d = l;
        uVar.a = name;
        uVar.f = nVar;
        uVar.c = name2;
        uVar.b = message;
        return uVar;
    }

    public void a(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        io.sentry.protocol.n nVar;
        boolean z;
        int iIncrementAndGet = atomicInteger.get();
        String str2 = str;
        while (th != null && hashSet.add(th)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                io.sentry.protocol.n nVar2 = exceptionMechanismException.a;
                Throwable th2 = exceptionMechanismException.b;
                threadCurrentThread = exceptionMechanismException.c;
                z = exceptionMechanismException.d;
                th = th2;
                nVar = nVar2;
            } else {
                io.sentry.protocol.n nVar3 = new io.sentry.protocol.n();
                threadCurrentThread = Thread.currentThread();
                nVar = nVar3;
                z = false;
            }
            io.sentry.protocol.u uVarC = c(th, nVar, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.a.c(th.getStackTrace(), Boolean.FALSE.equals(nVar.d)), z);
            ArrayDeque arrayDeque2 = arrayDeque;
            arrayDeque2.addFirst(uVarC);
            if (nVar.a == null) {
                nVar.a = str2;
            }
            if (atomicInteger.get() >= 0) {
                nVar.i = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            nVar.h = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                int i = 0;
                while (i < length) {
                    a(suppressed[i], atomicInteger, hashSet, arrayDeque2, "suppressed");
                    i++;
                    arrayDeque2 = arrayDeque;
                }
            }
            th = th.getCause();
            str2 = null;
        }
    }

    public ArrayList b(Map map, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayListC;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0();
            c0Var.c = thread2.getName();
            c0Var.b = Integer.valueOf(thread2.getPriority());
            c0Var.a = Long.valueOf(thread2.getId());
            c0Var.g = Boolean.valueOf(thread2.isDaemon());
            c0Var.d = thread2.getState().name();
            c0Var.e = Boolean.valueOf(z3);
            if (z2 && (arrayListC = this.a.c(stackTraceElementArr, false)) != null && !arrayListC.isEmpty()) {
                io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0(arrayListC);
                a0Var.c = Boolean.TRUE;
                c0Var.i = a0Var;
            }
            arrayList2.add(c0Var);
        }
        return arrayList2;
    }
}
