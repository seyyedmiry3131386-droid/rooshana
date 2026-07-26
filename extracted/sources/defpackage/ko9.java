package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko9 implements Executor {
    public static final /* synthetic */ ko9 b = new ko9(0);
    public static final /* synthetic */ ko9 c = new ko9(1);
    public static final /* synthetic */ ko9 d = new ko9(5);
    public final /* synthetic */ int a;

    public /* synthetic */ ko9(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                i29.f().post(runnable);
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
