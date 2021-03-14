package March14.exercise.users.app.repository;

import March14.exercise.users.app.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<News, Long> {
}
