package ir.mservices.market.myAccount.dialog.birthday;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface BirthDayAction extends r50 {

    public static final class SaveMiladiBirthDateAction implements BirthDayAction {
        private final String birthday;

        public SaveMiladiBirthDateAction(String str) {
            js3.p(str, "birthday");
            this.birthday = str;
        }

        public final String getBirthday() {
            return this.birthday;
        }
    }

    public static final class UpdateBirthdayAction implements BirthDayAction {
        private final String birthday;

        public UpdateBirthdayAction(String str) {
            js3.p(str, "birthday");
            this.birthday = str;
        }

        public final String getBirthday() {
            return this.birthday;
        }
    }
}
