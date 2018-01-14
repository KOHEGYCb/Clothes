package сlothes.service;

/**
 *
 * @author dmitry
 */
public enum Seasons {

    WINTER() {
        @Override
        public String toString() {
            return "Winter";
        }
    },
    SPRING() {
        @Override
        public String toString() {
            return "Spring";
        }
    },
    SUMMER() {
        @Override
        public String toString() {
            return "Summer";
        }
    },
    AUTUMN() {
        @Override
        public String toString() {
            return "Autumn";
        }
    };
    
    private Seasons(){
        
    }
        
    @Override
    public abstract String toString();
    
}
