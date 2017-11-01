import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Samson Kihuha on 11/1/2017.
 */

public class Databasehelper extends SQLiteOpenHelper {
    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Strathstudent";

    // Table Names
    private static final String TABLE_Info = "Info";
    private static final String TABLE_Course = "Course";
    private static final String TABLE_Units = "Units";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";
    private static final String KEY_COURSE_NAME = "course_name";
    private static final String KEY_YEAR = "year";
    // info Table - column names
    private static final String KEY_Firstname = "firstname";
    private static final String KEY_Lastname = "lastname";


    // course Table - column names

    private static final String KEY_SCHOOL = "school";
    private static final String KEY_COURSE_ID = "course_id";

    // Units Table - column names
    private static final String KEY_UNITS_ID = "unit_id";
    private static final String KEY_UNITS_NAME = "unit_name";

    // Table Create Statements
    // Todo table create statement
    private static final String CREATE_TABLE_INFO = "CREATE TABLE "
            + TABLE_Info + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_Firstname
            + " TEXT," + KEY_Lastname
            + " TEXT," + KEY_YEAR + " INTEGER," + KEY_CREATED_AT
            + " DATETIME" + ")";

    // Tag table create statement
    private static final String CREATE_TABLE_COURSE = "CREATE TABLE " + TABLE_Course
            + "(" + KEY_COURSE_ID + " INTEGER PRIMARY KEY," + KEY_COURSE_NAME + " TEXT,"
            + KEY_SCHOOL + " TEXT," + KEY_CREATED_AT + " DATETIME" + ")";

    // todo_tag table create statement
    private static final String CREATE_TABLE_UNITS = "CREATE TABLE "
            + TABLE_Units + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_UNITS_ID + " INTEGER," + KEY_UNITS_NAME+ " INTEGER,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    public Databasehelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_INFO);
        db.execSQL(CREATE_TABLE_COURSE);
        db.execSQL(CREATE_TABLE_UNITS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Info);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Course);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Units);

        // create new tables
        onCreate(db);
    }
}
