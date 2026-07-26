package ir.mservices.market.pika.common.model;

import android.net.Uri;
import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FileState {

    public static final class Canceled extends FileState {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    public static final class Failed extends FileState {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    public static final class InProgress extends FileState {
        private final long allData;
        private final long progress;
        private final long totalReceivedData;

        public InProgress(long j, long j2, long j3) {
            super(null);
            this.progress = j;
            this.totalReceivedData = j2;
            this.allData = j3;
        }

        public final long getAllData() {
            return this.allData;
        }

        public final long getProgress() {
            return this.progress;
        }

        public final long getTotalReceivedData() {
            return this.totalReceivedData;
        }
    }

    public static final class Received extends FileState {
        public static final Received INSTANCE = new Received();

        private Received() {
            super(null);
        }
    }

    public static final class Saved extends FileState {
        private final long id;
        private final boolean isSplitApk;
        private final String packageName;
        private final Uri uri;
        private final int versionCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(long j, String str, int i, boolean z, Uri uri) {
            super(null);
            js3.p(str, "packageName");
            this.id = j;
            this.packageName = str;
            this.versionCode = i;
            this.isSplitApk = z;
            this.uri = uri;
        }

        public final long getId() {
            return this.id;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final int getVersionCode() {
            return this.versionCode;
        }

        public final boolean isSplitApk() {
            return this.isSplitApk;
        }
    }

    public /* synthetic */ FileState(yd1 yd1Var) {
        this();
    }

    private FileState() {
    }
}
