package ir.mservices.market.social.profile.list;

import defpackage.bl4;
import defpackage.js3;
import defpackage.mh6;
import defpackage.n99;
import defpackage.o40;
import defpackage.r50;
import ir.mservices.market.common.data.ErrorMessage;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.ReportListType;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ProfileListAction extends r50 {

    public static final class AddAppListToOwnProfileAction implements ProfileListAction {
        private final List<ApplicationDTO> apps;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public AddAppListToOwnProfileAction(String str, List<? extends ApplicationDTO> list) {
            js3.p(str, "title");
            js3.p(list, "apps");
            this.title = str;
            this.apps = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddAppListToOwnProfileAction copy$default(AddAppListToOwnProfileAction addAppListToOwnProfileAction, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addAppListToOwnProfileAction.title;
            }
            if ((i & 2) != 0) {
                list = addAppListToOwnProfileAction.apps;
            }
            return addAppListToOwnProfileAction.copy(str, list);
        }

        public final String component1() {
            return this.title;
        }

        public final List<ApplicationDTO> component2() {
            return this.apps;
        }

        public final AddAppListToOwnProfileAction copy(String str, List<? extends ApplicationDTO> list) {
            js3.p(str, "title");
            js3.p(list, "apps");
            return new AddAppListToOwnProfileAction(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddAppListToOwnProfileAction)) {
                return false;
            }
            AddAppListToOwnProfileAction addAppListToOwnProfileAction = (AddAppListToOwnProfileAction) obj;
            return js3.i(this.title, addAppListToOwnProfileAction.title) && js3.i(this.apps, addAppListToOwnProfileAction.apps);
        }

        public final List<ApplicationDTO> getApps() {
            return this.apps;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.apps.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "AddAppListToOwnProfileAction(title=" + this.title + ", apps=" + this.apps + ")";
        }
    }

    public static final class AddListAction implements ProfileListAction {
        public static final AddListAction INSTANCE = new AddListAction();

        private AddListAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AddListAction);
        }

        public int hashCode() {
            return -1487046608;
        }

        public String toString() {
            return "AddListAction";
        }
    }

    public static final class AddListToOwnProfileAction implements ProfileListAction {
        private final n99 viewState;

        public AddListToOwnProfileAction(n99 n99Var) {
            js3.p(n99Var, "viewState");
            this.viewState = n99Var;
        }

        public static /* synthetic */ AddListToOwnProfileAction copy$default(AddListToOwnProfileAction addListToOwnProfileAction, n99 n99Var, int i, Object obj) {
            if ((i & 1) != 0) {
                n99Var = addListToOwnProfileAction.viewState;
            }
            return addListToOwnProfileAction.copy(n99Var);
        }

        public final n99 component1() {
            return this.viewState;
        }

        public final AddListToOwnProfileAction copy(n99 n99Var) {
            js3.p(n99Var, "viewState");
            return new AddListToOwnProfileAction(n99Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddListToOwnProfileAction) && js3.i(this.viewState, ((AddListToOwnProfileAction) obj).viewState);
        }

        public final n99 getViewState() {
            return this.viewState;
        }

        public int hashCode() {
            return this.viewState.hashCode();
        }

        public String toString() {
            return "AddListToOwnProfileAction(viewState=" + this.viewState + ")";
        }
    }

    public static final class AddMovieListToOwnProfileAction implements ProfileListAction {
        private final List<MovieDto> movies;
        private final String title;

        public AddMovieListToOwnProfileAction(String str, List<MovieDto> list) {
            js3.p(str, "title");
            js3.p(list, "movies");
            this.title = str;
            this.movies = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddMovieListToOwnProfileAction copy$default(AddMovieListToOwnProfileAction addMovieListToOwnProfileAction, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addMovieListToOwnProfileAction.title;
            }
            if ((i & 2) != 0) {
                list = addMovieListToOwnProfileAction.movies;
            }
            return addMovieListToOwnProfileAction.copy(str, list);
        }

        public final String component1() {
            return this.title;
        }

        public final List<MovieDto> component2() {
            return this.movies;
        }

        public final AddMovieListToOwnProfileAction copy(String str, List<MovieDto> list) {
            js3.p(str, "title");
            js3.p(list, "movies");
            return new AddMovieListToOwnProfileAction(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddMovieListToOwnProfileAction)) {
                return false;
            }
            AddMovieListToOwnProfileAction addMovieListToOwnProfileAction = (AddMovieListToOwnProfileAction) obj;
            return js3.i(this.title, addMovieListToOwnProfileAction.title) && js3.i(this.movies, addMovieListToOwnProfileAction.movies);
        }

        public final List<MovieDto> getMovies() {
            return this.movies;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.movies.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "AddMovieListToOwnProfileAction(title=" + this.title + ", movies=" + this.movies + ")";
        }
    }

    public static final class ClearAll implements ProfileListAction {
        public static final ClearAll INSTANCE = new ClearAll();

        private ClearAll() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearAll);
        }

        public int hashCode() {
            return -973306119;
        }

        public String toString() {
            return "ClearAll";
        }
    }

    public static final class DeleteListAction implements ProfileListAction {
        private final String listType;

        public DeleteListAction(String str) {
            js3.p(str, "listType");
            this.listType = str;
        }

        public static /* synthetic */ DeleteListAction copy$default(DeleteListAction deleteListAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deleteListAction.listType;
            }
            return deleteListAction.copy(str);
        }

        public final String component1() {
            return this.listType;
        }

        public final DeleteListAction copy(String str) {
            js3.p(str, "listType");
            return new DeleteListAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteListAction) && js3.i(this.listType, ((DeleteListAction) obj).listType);
        }

        public final String getListType() {
            return this.listType;
        }

        public int hashCode() {
            return this.listType.hashCode();
        }

        public String toString() {
            return o40.y("DeleteListAction(listType=", this.listType, ")");
        }
    }

    public static final class EditAppsListAction implements ProfileListAction {
        private final ProfileApplicationListDto applicationList;

        public EditAppsListAction(ProfileApplicationListDto profileApplicationListDto) {
            js3.p(profileApplicationListDto, "applicationList");
            this.applicationList = profileApplicationListDto;
        }

        public static /* synthetic */ EditAppsListAction copy$default(EditAppsListAction editAppsListAction, ProfileApplicationListDto profileApplicationListDto, int i, Object obj) {
            if ((i & 1) != 0) {
                profileApplicationListDto = editAppsListAction.applicationList;
            }
            return editAppsListAction.copy(profileApplicationListDto);
        }

        public final ProfileApplicationListDto component1() {
            return this.applicationList;
        }

        public final EditAppsListAction copy(ProfileApplicationListDto profileApplicationListDto) {
            js3.p(profileApplicationListDto, "applicationList");
            return new EditAppsListAction(profileApplicationListDto);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditAppsListAction) && js3.i(this.applicationList, ((EditAppsListAction) obj).applicationList);
        }

        public final ProfileApplicationListDto getApplicationList() {
            return this.applicationList;
        }

        public int hashCode() {
            return this.applicationList.hashCode();
        }

        public String toString() {
            return "EditAppsListAction(applicationList=" + this.applicationList + ")";
        }
    }

    public static final class EditMoviesListAction implements ProfileListAction {
        private final ProfileMovieListDto movieList;

        public EditMoviesListAction(ProfileMovieListDto profileMovieListDto) {
            js3.p(profileMovieListDto, "movieList");
            this.movieList = profileMovieListDto;
        }

        public static /* synthetic */ EditMoviesListAction copy$default(EditMoviesListAction editMoviesListAction, ProfileMovieListDto profileMovieListDto, int i, Object obj) {
            if ((i & 1) != 0) {
                profileMovieListDto = editMoviesListAction.movieList;
            }
            return editMoviesListAction.copy(profileMovieListDto);
        }

        public final ProfileMovieListDto component1() {
            return this.movieList;
        }

        public final EditMoviesListAction copy(ProfileMovieListDto profileMovieListDto) {
            js3.p(profileMovieListDto, "movieList");
            return new EditMoviesListAction(profileMovieListDto);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditMoviesListAction) && js3.i(this.movieList, ((EditMoviesListAction) obj).movieList);
        }

        public final ProfileMovieListDto getMovieList() {
            return this.movieList;
        }

        public int hashCode() {
            return this.movieList.hashCode();
        }

        public String toString() {
            return "EditMoviesListAction(movieList=" + this.movieList + ")";
        }
    }

    public static final class ErrorAction implements ProfileListAction {
        private final ErrorMessage errorMessage;

        public ErrorAction(ErrorMessage errorMessage) {
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ ErrorAction copy$default(ErrorAction errorAction, ErrorMessage errorMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                errorMessage = errorAction.errorMessage;
            }
            return errorAction.copy(errorMessage);
        }

        public final ErrorMessage component1() {
            return this.errorMessage;
        }

        public final ErrorAction copy(ErrorMessage errorMessage) {
            return new ErrorAction(errorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorAction) && js3.i(this.errorMessage, ((ErrorAction) obj).errorMessage);
        }

        public final ErrorMessage getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            ErrorMessage errorMessage = this.errorMessage;
            if (errorMessage == null) {
                return 0;
            }
            return errorMessage.hashCode();
        }

        public String toString() {
            return "ErrorAction(errorMessage=" + this.errorMessage + ")";
        }
    }

    public static final class Init implements ProfileListAction {
        private final boolean isApp;

        public Init(boolean z) {
            this.isApp = z;
        }

        public static /* synthetic */ Init copy$default(Init init, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = init.isApp;
            }
            return init.copy(z);
        }

        public final boolean component1() {
            return this.isApp;
        }

        public final Init copy(boolean z) {
            return new Init(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && this.isApp == ((Init) obj).isApp;
        }

        public int hashCode() {
            return this.isApp ? 1231 : 1237;
        }

        public final boolean isApp() {
            return this.isApp;
        }

        public String toString() {
            return bl4.x("Init(isApp=", ")", this.isApp);
        }
    }

    public static final class LikeListAction implements ProfileListAction {
        private final String listType;

        public LikeListAction(String str) {
            js3.p(str, "listType");
            this.listType = str;
        }

        public static /* synthetic */ LikeListAction copy$default(LikeListAction likeListAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = likeListAction.listType;
            }
            return likeListAction.copy(str);
        }

        public final String component1() {
            return this.listType;
        }

        public final LikeListAction copy(String str) {
            js3.p(str, "listType");
            return new LikeListAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LikeListAction) && js3.i(this.listType, ((LikeListAction) obj).listType);
        }

        public final String getListType() {
            return this.listType;
        }

        public int hashCode() {
            return this.listType.hashCode();
        }

        public String toString() {
            return o40.y("LikeListAction(listType=", this.listType, ")");
        }
    }

    public static final class MoveToTopListAction implements ProfileListAction {
        private final String listType;

        public MoveToTopListAction(String str) {
            js3.p(str, "listType");
            this.listType = str;
        }

        public static /* synthetic */ MoveToTopListAction copy$default(MoveToTopListAction moveToTopListAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = moveToTopListAction.listType;
            }
            return moveToTopListAction.copy(str);
        }

        public final String component1() {
            return this.listType;
        }

        public final MoveToTopListAction copy(String str) {
            js3.p(str, "listType");
            return new MoveToTopListAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoveToTopListAction) && js3.i(this.listType, ((MoveToTopListAction) obj).listType);
        }

        public final String getListType() {
            return this.listType;
        }

        public int hashCode() {
            return this.listType.hashCode();
        }

        public String toString() {
            return o40.y("MoveToTopListAction(listType=", this.listType, ")");
        }
    }

    public static final class PoliciesMetAction implements ProfileListAction {
        private final mh6 policies;

        public PoliciesMetAction(mh6 mh6Var) {
            this.policies = mh6Var;
        }

        public static /* synthetic */ PoliciesMetAction copy$default(PoliciesMetAction policiesMetAction, mh6 mh6Var, int i, Object obj) {
            if ((i & 1) != 0) {
                mh6Var = policiesMetAction.policies;
            }
            return policiesMetAction.copy(mh6Var);
        }

        public final mh6 component1() {
            return this.policies;
        }

        public final PoliciesMetAction copy(mh6 mh6Var) {
            return new PoliciesMetAction(mh6Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoliciesMetAction) && js3.i(this.policies, ((PoliciesMetAction) obj).policies);
        }

        public final mh6 getPolicies() {
            return this.policies;
        }

        public int hashCode() {
            mh6 mh6Var = this.policies;
            if (mh6Var == null) {
                return 0;
            }
            return mh6Var.hashCode();
        }

        public String toString() {
            return "PoliciesMetAction(policies=" + this.policies + ")";
        }
    }

    public static final class RefreshAction implements ProfileListAction {
        private final boolean refresh;

        public RefreshAction(boolean z) {
            this.refresh = z;
        }

        public static /* synthetic */ RefreshAction copy$default(RefreshAction refreshAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = refreshAction.refresh;
            }
            return refreshAction.copy(z);
        }

        public final boolean component1() {
            return this.refresh;
        }

        public final RefreshAction copy(boolean z) {
            return new RefreshAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshAction) && this.refresh == ((RefreshAction) obj).refresh;
        }

        public final boolean getRefresh() {
            return this.refresh;
        }

        public int hashCode() {
            return this.refresh ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("RefreshAction(refresh=", ")", this.refresh);
        }
    }

    public static final class RemoveLikeListAction implements ProfileListAction {
        private final String listType;

        public RemoveLikeListAction(String str) {
            js3.p(str, "listType");
            this.listType = str;
        }

        public static /* synthetic */ RemoveLikeListAction copy$default(RemoveLikeListAction removeLikeListAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = removeLikeListAction.listType;
            }
            return removeLikeListAction.copy(str);
        }

        public final String component1() {
            return this.listType;
        }

        public final RemoveLikeListAction copy(String str) {
            js3.p(str, "listType");
            return new RemoveLikeListAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveLikeListAction) && js3.i(this.listType, ((RemoveLikeListAction) obj).listType);
        }

        public final String getListType() {
            return this.listType;
        }

        public int hashCode() {
            return this.listType.hashCode();
        }

        public String toString() {
            return o40.y("RemoveLikeListAction(listType=", this.listType, ")");
        }
    }

    public static final class ReportListAction implements ProfileListAction {
        private final String listType;
        private final ReportListType type;

        public ReportListAction(String str, ReportListType reportListType) {
            js3.p(str, "listType");
            js3.p(reportListType, "type");
            this.listType = str;
            this.type = reportListType;
        }

        public static /* synthetic */ ReportListAction copy$default(ReportListAction reportListAction, String str, ReportListType reportListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reportListAction.listType;
            }
            if ((i & 2) != 0) {
                reportListType = reportListAction.type;
            }
            return reportListAction.copy(str, reportListType);
        }

        public final String component1() {
            return this.listType;
        }

        public final ReportListType component2() {
            return this.type;
        }

        public final ReportListAction copy(String str, ReportListType reportListType) {
            js3.p(str, "listType");
            js3.p(reportListType, "type");
            return new ReportListAction(str, reportListType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportListAction)) {
                return false;
            }
            ReportListAction reportListAction = (ReportListAction) obj;
            return js3.i(this.listType, reportListAction.listType) && this.type == reportListAction.type;
        }

        public final String getListType() {
            return this.listType;
        }

        public final ReportListType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.listType.hashCode() * 31);
        }

        public String toString() {
            return "ReportListAction(listType=" + this.listType + ", type=" + this.type + ")";
        }
    }

    public static final class ToastAction implements ProfileListAction {
        private final String message;

        public ToastAction(String str) {
            this.message = str;
        }

        public static /* synthetic */ ToastAction copy$default(ToastAction toastAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toastAction.message;
            }
            return toastAction.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ToastAction copy(String str) {
            return new ToastAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToastAction) && js3.i(this.message, ((ToastAction) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("ToastAction(message=", this.message, ")");
        }
    }
}
