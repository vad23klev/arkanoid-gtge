Игра арканоид с использованием библиотеки GTGE.
===============================================
Диаграмма Классов
-----------------

![alt tag](https://raw.github.com/vad23klev/arkanoid-gtge/master/Arcanoid.png)

Пояснение к Диаграмме:
----------------------

При построении диаграммы мы исходи из соображений, что должен существовать общий класс для решения коллизий возникающих между игровыми объектами, а каждый игровой объект сам должен решать как ему себя вести в той или иной ситуации. Такой подход нам дал возможность избежать написания лишнего кода в основных классах, а так же обеспечить наследование не только свойст при создании новых игровых объектов, но и поведения родителей.

**Описание пакетов:**

* *View* - предстваление, часть программы отвечающая за отображение.
* *Model* - модель, часть программы отвечающая за логику игры.
* *CollisionControl* - обработчик коллизий между игровыми объектами.
* *Buffer* - связующее звено между представлением и моделью.

**Описание классов на диаграмме:**

* *GameObject* - класс игрового объекта, связывает модель и представление.
* *GameView* - абстрактный класс для описания игрового представления (*содержит контейнер спрайтов для определенного игрового объекта*).
* *GameModel* - абстрактный класс для описания игровой модели (*шар*, *ракетка*, *кирпич* и т.д.).
* *GameControl* - класс для обработки коллизий между игровыми объектами.
* *GameCollisionBounds* - класс
* *GameAdvanceCollisionGroups* - класс

**Описание работы:**

Объекты классов *GameCollisionBounds* и *GameAdvanceCollisionGroups* отлавливают коллизии между игровыми объектами и сообщают это объекту класса *GameControl*, тот в свою очередь обрабатывает коллизию и сообщает игровым моделям (наследникам от класса *GameModel*) о том, что они столкнулись друг с другом. Те в свою очередь реагируют на столкновение определенным образом (меняя свои свойста при необходимости), после чего сообщают своему предствалению (наследникам от класса *GameView*) о том, что произошли изменения в свойствам и это необходимо представить пользователю. Объекты представления пользуюсь данными из модели выбирают свое поведение и отображают пользователю истинную картину игрового поля.
