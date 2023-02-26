import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.FilmManager;

public class FilmManagerTest {

    @Test
    public void findAllFilms() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findOneFilm() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findEmptyFilm() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm() {
        FilmManager manager = new FilmManager(10);
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmOnlyOne() {
        FilmManager manager = new FilmManager(1);
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {"Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmUnderLimit() {
        FilmManager manager = new FilmManager(15);
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmZero() {
        FilmManager manager = new FilmManager(0);
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmNine() {
        FilmManager manager = new FilmManager(9);
        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперед");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
