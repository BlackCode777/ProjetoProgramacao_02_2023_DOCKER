FROM python:3.6
LABEL maintainer 'Aluno Anderson Coder <Anderson at coder.com.br>'

# Recomendado seria sempre ter um comando com varias label dentro
RUN useradd www && \
         mkdir /app && \
         mkdir /log && \
         chown www /log

USER www
VOLUME /log
WORKDIR /app
EXPOSE 8000

ENTRYPOINT [ "\Users\Anderson_windowsPRO\AppData\Local\Programs\Python" ]
CMD [ "run.py" ]